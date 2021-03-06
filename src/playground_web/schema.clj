(ns playground-web.schema)


(def shema [
 {:db/ident :movie/title
  :db/valueType :db.type/string
  :db/cardinality :db.cardinality/one
  :db/doc "Title of the movie"}

 {:db/ident :movie/year
  :db/valueType :db.type/long
  :db/cardinality :db.cardinality/one
  :db/doc "The year in which the movie was released to theatres"}

 {:db/ident :movie/director
  :db/valueType :db.type/ref
  :db/cardinality :db.cardinality/many
  :db/doc "The person who directed the movie"}

 {:db/ident :movie/sequel
  :db/valueType :db.type/ref
  :db/cardinality :db.cardinality/one
  :db/doc "Name of the of the series if an to which the movie belongs"}
 
 {:db/ident :movie/cast
  :db/valueType :db.type/ref
  :db/cardinality :db.cardinality/many
  :db/doc "Reference to the list of entities repecenting actors"}
 
 {:db/ident :person/name
  :db/valueType :db.type/string
  :db/cardinality :db.cardinality/one
  :db/doc "Name of a person entity"}

 {:db/ident :person/born
  :db/valueType :db.type/instant
  :db/cardinality :db.cardinality/one
  :db/doc "Date of birth of a person entity"}

{:db/ident :person/death
  :db/valueType :db.type/instant
  :db/cardinality :db.cardinality/one
  :db/doc "Date of passage"}

 {:db/ident :trivia
  :db/valueType :db.type/string
  :db/cardinality :db.cardinality/many
  :db/doc "??"}
])


(def d [
 {:db/id #db/id [:db.part/user -100]
  :person/name "James Cameron"
  :person/born #inst "1954-08-16"}

 {:db/id #db/id [:db.part/user -101]
  :person/name "Arnold Schwarzenegger"
  :person/born #inst "1947-07-30"}

 {:db/id #db/id [:db.part/user -102]
  :person/name "Linda Hamilton"
  :person/born #inst "1956-09-26"}

 {:db/id #db/id [:db.part/user -103]
  :person/name "Michael Biehn"
  :person/born #inst "1956-07-31"}

 {:db/id #db/id [:db.part/user -104]
  :person/name "Ted Kotcheff"
  :person/born #inst "1931-04-07"}
 
 {:db/id #db/id [:db.part/user -105]
  :person/name "Sylvester Stallone"
  :person/born #inst "1946-07-06"}
 
 {:db/id #db/id [:db.part/user -106]
  :person/name "Richard Crenna"
  :person/born #inst "1926-11-30"
  :person/death #inst "2003-01-17"}
 
 {:db/id #db/id [:db.part/user -107]
  :person/name "Brian Dennehy"
  :person/born #inst "1938-07-09"}

 {:db/id #db/id [:db.part/user -108]
  :person/name "John McTiernan"
  :person/born #inst "1951-01-08"}
 
 {:db/id #db/id [:db.part/user -109]
  :person/name "Elpidia Carrillo"
  :person/born #inst "1961-08-16"}

 {:db/id #db/id [:db.part/user -110]
  :person/name "Carl Weathers"
  :person/born #inst "1948-01-14"}

 {:db/id #db/id [:db.part/user -111]
  :person/name "Richard Donner"
  :person/born #inst "1930-04-24"}

 {:db/id #db/id [:db.part/user -112]
  :person/name "Mel Gibson"
  :person/born #inst "1956-01-03"}

 {:db/id #db/id [:db.part/user -113]
  :person/name "Danny Glover"
  :person/born #inst "1946-07-22"}

 {:db/id #db/id [:db.part/user -114]
  :person/name "Gary Busey"
  :person/born #inst "1944-07-29"}

 {:db/id #db/id [:db.part/user -115]
  :person/name "Paul Verhoeven"
  :person/born #inst "1938-07-18"}

 {:db/id #db/id [:db.part/user -116]
  :person/name "Peter Weller"
  :person/born #inst "1947-06-24"}

 {:db/id #db/id [:db.part/user -117]
  :person/name "Nancy Allen"
  :person/born #inst "1950-06-24"}

 {:db/id #db/id [:db.part/user -118]
  :person/name "Ronny Cox"
  :person/born #inst "1938-07-23"}

 {:db/id #db/id [:db.part/user -119]
  :person/name "Mark L. Lester"
  :person/born #inst "1946-11-26"}

 {:db/id #db/id [:db.part/user -120]
  :person/name "Rae Dawn Chong"
  :person/born #inst "1961-02-28"}

 {:db/id #db/id [:db.part/user -121]
  :person/name "Alyssa Milano"
  :person/born #inst "1972-12-19"}

 {:db/id #db/id [:db.part/user -122]
  :person/name "Bruce Willis"
  :person/born #inst "1955-03-19"}

 {:db/id #db/id [:db.part/user -123]
  :person/name "Alan Rickman"
  :person/born #inst "1946-02-21"}

 {:db/id #db/id [:db.part/user -124]
  :person/name "Alexander Godunov"
  :person/born #inst "1949-11-28"
  :person/death #inst "1995-05-18"}

 {:db/id #db/id [:db.part/user -125]
  :person/name "Robert Patrick"
  :person/born #inst "1958-11-05"}

 {:db/id #db/id [:db.part/user -126]
  :person/name "Edward Furlong"
  :person/born #inst "1977-08-02"}

 {:db/id #db/id [:db.part/user -127]
  :person/name "Jonathan Mostow"
  :person/born #inst "1961-11-28"}

 {:db/id #db/id [:db.part/user -128]
  :person/name "Nick Stahl"
  :person/born #inst "1979-12-05"}

 {:db/id #db/id [:db.part/user -129]
  :person/name "Claire Danes"
  :person/born #inst "1979-04-12"}

 {:db/id #db/id [:db.part/user -130]
  :person/name "George P. Cosmatos"
  :person/born #inst "1941-01-04"
  :person/death #inst "2005-04-19"}

 {:db/id #db/id [:db.part/user -131]
  :person/name "Charles Napier"
  :person/born #inst "1936-04-12"
  :person/death #inst "2011-10-05"}

 {:db/id #db/id [:db.part/user -132]
  :person/name "Peter MacDonald"}

 {:db/id #db/id [:db.part/user -133]
  :person/name "Marc de Jonge"
  :person/born #inst "1949-02-16"
  :person/death #inst "1996-06-06"}

 {:db/id #db/id [:db.part/user -134]
  :person/name "Stephen Hopkins"}

 {:db/id #db/id [:db.part/user -135]
  :person/name "Ruben Blades"
  :person/born #inst "1948-07-16"}

 {:db/id #db/id [:db.part/user -136]
  :person/name "Joe Pesci"
  :person/born #inst "1943-02-09"}

 {:db/id #db/id [:db.part/user -137]
  :person/name "Ridley Scott"
  :person/born #inst "1937-11-30"}

 {:db/id #db/id [:db.part/user -138]
  :person/name "Tom Skerritt"
  :person/born #inst "1933-08-25"}

 {:db/id #db/id [:db.part/user -139]
  :person/name "Sigourney Weaver"
  :person/born #inst "1949-10-08"}

 {:db/id #db/id [:db.part/user -140]
  :person/name "Veronica Cartwright"
  :person/born #inst "1949-04-20"}

 {:db/id #db/id [:db.part/user -141]
  :person/name "Carrie Henn"}

 {:db/id #db/id [:db.part/user -142]
  :person/name "George Miller"
  :person/born #inst "1945-03-03"}

 {:db/id #db/id [:db.part/user -143]
  :person/name "Steve Bisley"
  :person/born #inst "1951-12-26"}

 {:db/id #db/id [:db.part/user -144]
  :person/name "Joanne Samuel"}

 {:db/id #db/id [:db.part/user -145]
  :person/name "Michael Preston"
  :person/born #inst "1938-05-14"}

 {:db/id #db/id [:db.part/user -146]
  :person/name "Bruce Spence"
  :person/born #inst "1945-09-17"}

 {:db/id #db/id [:db.part/user -147]
  :person/name "George Ogilvie"
  :person/born #inst "1931-03-05"}

 {:db/id #db/id [:db.part/user -148]
  :person/name "Tina Turner"
  :person/born #inst "1939-11-26"}

 {:db/id #db/id [:db.part/user -149]
  :person/name "Sophie Marceau"
  :person/born #inst "1966-11-17"}

 {:db/id #db/id [:db.part/user -200]
  :movie/title "The Terminator"
  :movie/year 1984
  :movie/director #db/id [:db.part/user -100]
  :movie/cast [#db/id [:db.part/user -101]
               #db/id [:db.part/user -102]
               #db/id [:db.part/user -103]]
  :movie/sequel #db/id [:db.part/user -207]}

 {:db/id #db/id [:db.part/user -201]
  :movie/title "First Blood"
  :movie/year 1982
  :movie/director #db/id [:db.part/user -104]
  :movie/cast [#db/id [:db.part/user -105]
               #db/id [:db.part/user -106]
               #db/id [:db.part/user -107]]
  :movie/sequel #db/id [:db.part/user -209]}

 {:db/id #db/id [:db.part/user -202]
  :movie/title "Predator"
  :movie/year 1987
  :movie/director #db/id [:db.part/user -108]
  :movie/cast [#db/id [:db.part/user -101]
               #db/id [:db.part/user -109]
               #db/id [:db.part/user -110]]
  :movie/sequel #db/id [:db.part/user -211]}

 {:db/id #db/id [:db.part/user -203]
  :movie/title "Lethal Weapon"
  :movie/year 1987
  :movie/director #db/id [:db.part/user -111]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -113]
               #db/id [:db.part/user -114]]
  :movie/sequel #db/id [:db.part/user -212]}

 {:db/id #db/id [:db.part/user -204]
  :movie/title "RoboCop"
  :movie/year 1987
  :movie/director #db/id [:db.part/user -115]
  :movie/cast [#db/id [:db.part/user -116]
               #db/id [:db.part/user -117]
               #db/id [:db.part/user -118]]}

 {:db/id #db/id [:db.part/user -205]
  :movie/title "Commando"
  :movie/year 1985
  :movie/director #db/id [:db.part/user -119]
  :movie/cast [#db/id [:db.part/user -101]
               #db/id [:db.part/user -120]
               #db/id [:db.part/user -121]]
  :trivia "In 1986, a sequel was written with an eye to having
  John McTiernan direct. Schwarzenegger wasn't interested in reprising
  the role. The script was then reworked with a new central character,
  eventually played by Bruce Willis, and became Die Hard"}

 {:db/id #db/id [:db.part/user -206]
  :movie/title "Die Hard"
  :movie/year 1988
  :movie/director #db/id [:db.part/user -108]
  :movie/cast [#db/id [:db.part/user -122]
               #db/id [:db.part/user -123]
               #db/id [:db.part/user -124]]}

 {:db/id #db/id [:db.part/user -207]
  :movie/title "Terminator 2: Judgment Day"
  :movie/year 1991
  :movie/director #db/id [:db.part/user -100]
  :movie/cast [#db/id [:db.part/user -101]
               #db/id [:db.part/user -102]
               #db/id [:db.part/user -125]
               #db/id [:db.part/user -126]]
  :movie/sequel #db/id [:db.part/user -208]}

 {:db/id #db/id [:db.part/user -208]
  :movie/title "Terminator 3: Rise of the Machines"
  :movie/year 2003
  :movie/director #db/id [:db.part/user -127]
  :movie/cast [#db/id [:db.part/user -101]
               #db/id [:db.part/user -128]
               #db/id [:db.part/user -129]]}

 {:db/id #db/id [:db.part/user -209]
  :movie/title "Rambo: First Blood Part II"
  :movie/year 1985
  :movie/director #db/id [:db.part/user -130]
  :movie/cast [#db/id [:db.part/user -105]
               #db/id [:db.part/user -106]
               #db/id [:db.part/user -131]]
  :movie/sequel #db/id [:db.part/user -210]}

 {:db/id #db/id [:db.part/user -210]
  :movie/title "Rambo III"
  :movie/year 1988
  :movie/director #db/id [:db.part/user -132]
  :movie/cast [#db/id [:db.part/user -105]
               #db/id [:db.part/user -106]
               #db/id [:db.part/user -133]]}

 {:db/id #db/id [:db.part/user -211]
  :movie/title "Predator 2"
  :movie/year 1990
  :movie/director #db/id [:db.part/user -134]
  :movie/cast [#db/id [:db.part/user -113]
               #db/id [:db.part/user -114]
               #db/id [:db.part/user -135]]}

 {:db/id #db/id [:db.part/user -212]
  :movie/title "Lethal Weapon 2"
  :movie/year 1989
  :movie/director #db/id [:db.part/user -111]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -113]
               #db/id [:db.part/user -136]]
  :movie/sequel #db/id [:db.part/user -213]}

 {:db/id #db/id [:db.part/user -213]
  :movie/title "Lethal Weapon 3"
  :movie/year 1992
  :movie/director #db/id [:db.part/user -111]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -113]
               #db/id [:db.part/user -136]]}

 {:db/id #db/id [:db.part/user -214]
  :movie/title "Alien"
  :movie/year 1979
  :movie/director #db/id [:db.part/user -137]
  :movie/cast [#db/id [:db.part/user -138]
               #db/id [:db.part/user -139]
               #db/id [:db.part/user -140]]
  :movie/sequel #db/id [:db.part/user -215]}

 {:db/id #db/id [:db.part/user -215]
  :movie/title "Aliens"
  :movie/year 1986
  :movie/director #db/id [:db.part/user -100]
  :movie/cast [#db/id [:db.part/user -139]
               #db/id [:db.part/user -141]
               #db/id [:db.part/user -103]]}

 {:db/id #db/id [:db.part/user -216]
  :movie/title "Mad Max"
  :movie/year 1979
  :movie/director #db/id [:db.part/user -142]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -143]
               #db/id [:db.part/user -144]]
  :movie/sequel #db/id [:db.part/user -217]}

 {:db/id #db/id [:db.part/user -217]
  :movie/title "Mad Max 2"
  :movie/year 1981
  :movie/director #db/id [:db.part/user -142]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -145]
               #db/id [:db.part/user -146]]
  :movie/sequel #db/id [:db.part/user -218]}

 {:db/id #db/id [:db.part/user -218]
  :movie/title "Mad Max Beyond Thunderdome"
  :movie/year 1985
  :movie/director [#db/id [:db.part/user -142]
                   #db/id [:db.part/user -147]]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -148]]}

 {:db/id #db/id [:db.part/user -219]
  :movie/title "Braveheart"
  :movie/year 1995
  :movie/director [#db/id [:db.part/user -112]]
  :movie/cast [#db/id [:db.part/user -112]
               #db/id [:db.part/user -149]]}])
