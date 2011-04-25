(use 'thor.lang :reload-all)

(defduration 100)

(defexpt wireless-expt
         {
          :title "Simple DHT"
          :devices {:types ["phone-1"]
                    :number 1e4
                    :sample 'random
                    }
          :area {:width 100 :height 100}
          :direction 0 ; eventually want to override for particular device
          :speed 0
          }
         )
; For the values of Path Propagation Loss - look at
; Wireless Networks - Local and Wireless Networks (Ivan Marsic ) [Pg 33]
;
; wireless is there to allow for expansion into wired network
(defmedium wireless {
            :bandwidth "1.5 Mbps"
            :frequency "2.4 GHz"
            :channel 6 ; not implementing - assumed default
            :propagation-loss-expt 2 ; free space (default)
            :loss [] ; determines how much power 
                     ; loss is to be calculated 
                     ; (propagation loss automatically done )
            :noise 0 ; noise ignored
            })


(at-start (do 
            (println "Experiment starting  " 
                   (get-current-time)
                     )
            (println (get-network-attrs))
            ))
(at-end (println "This is the end my friend  "
                 (get-current-time) ))



(simulation-run)
