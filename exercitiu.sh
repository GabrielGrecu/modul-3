#!/bin/bash

while true; do
    echo "Meniu:"
    echo "1. Ieșire"
    echo "2. Afișare informații despre sistemul de operare"
    echo "3. Afișare săptămâna și ziua Crăciunului"
    echo "4. Afișare primele 2 shell-uri instalate"
    echo "5. Afișare informații utilizatori"
    echo "6. Afișare ultimele linii din /etc/protocols"
    echo "7. Afișare tip procesor și mărimea cache-ului"
    echo "8. Afișare nume directoare din /proc"
    echo "9. Căutare în fișierele de log"
    read -p "Selectați o opțiune: " option

    case $option in
        1)
            echo "La revedere!"
            break
            ;;
        2)
            pid=$$
            os_type=$(uname -s)
            seconds=$(($(date +%s) - $(date +%s -r /proc/$pid)))
            current_path=$(pwd)
            echo "ID proces: $pid"
            echo "Tip sistem de operare: $os_type"
            echo "Număr de secunde de la pornirea scriptului: $seconds"
            echo "Cale curentă: $current_path"
            ;;
        3)
            current_year=$(date +%Y)
            christmas_week=$(date -d "$current_year-12-25" +%V)
            christmas_day=$(date -d "$current_year-12-25" +%A)
            echo "Săptămâna Crăciunului: $christmas_week"
            echo "Ziua Crăciunului: $christmas_day"
            ;;
        4)
            echo "Primele 2 shell-uri instalate:"
            head -n 2 /etc/shells
            ;;
        5)
            echo "Informații utilizatori:"
            awk -F':' '{print "Nume de login: "$1", User ID: "$3", Nume complet: "$5", Director home: "$6}' /etc/passwd
            ;;
        6)
            echo "Ultimele linii din /etc/protocols începând cu linia 9:"
            tail -n +9 /etc/protocols
            ;;
        7)
            echo "Informații despre procesor și cache:"
            cat /proc/cpuinfo | grep -E 'model name|cache size'
            ;;
        8)
            echo "Numele directoarelor din /proc care nu reprezintă imagini de procese pe disc:"
            ls -d /proc/[!0-9]*
            ;;
        9)
            read -p "Introduceți numele fișierului de log: " log_file
            read -p "Introduceți textul de căutat: " search_text
            if [[ $log_file == *".gz" ]]; then
                gunzip -c $log_file | grep "$search_text"
            else
                grep "$search_text" $log_file
            fi
            ;;
        *)
            echo "Opțiune invalidă! Vă rugăm să alegeți din nou."
            ;;
    esac
done
