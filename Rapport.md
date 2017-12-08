# Le projet :
Le projet a pour but de créer un **Pokedeck** en Java qui permet de manipuler les cartes Pokémon. Nous pouvons avec ce pokedeck ajouter, supprimer ou modifier une carte Pokémon avec différents types de cartes comme des cartes Trainer, Pokémon ou bien des cartes énergies.

# Interface :
Ici la classe **Pokedeck** lance tout d'abord la méthode **Start** du **Menu**, il s’agit de l’interface principal ou l’utilisateur va pouvoir choisir entre plusieurs options *(utilisation de la classe scanner)*: 
* Ajouter une carte
* Supprimer un carte
* Mettre à jour une carte existante
* Voir le paquet de carte
* Rechercher une carte selon certains critères
* Quitter le programme

# Les classes :
La classe **Pokedeck** est donc la classe principale qui appel la méthode de la classe **Menu** qui sert directement d’interface avec l’utilisateur, selon le choix de l’utilisateur *(utilisation d’un switch)*. 

Si celui-ci décide d’ajouter une carte par exemple, cela va appeler la méthode **addCardDeck** présente dans la classe **GameConsole** puis lancer le processus de création d'une carte selon les choix de l'utilisateur qui seront gérer à travers un switch.   de la classe AddCard qui permet d’ajouter une carte.

La classe va demander à l’utilisateur quel “type” de carte veux-t il ajouté *(un Pokémon, un trainer ou bien une carte énergie)*. Selon son choix, une méthode va être appelée, si celui-ci par exemple décide de créer un pokémon, cela va lancer la le case du switch associé à la création d'un pokémon ** ou il pourra saisir un nom, un certain nombre de points de vie puis un type d'énergie

**A SAVOIR** : Chaque carte possède un identifiant qui va permettre de gérer cette carte. Les types d'énergies ainsi que les types de trainers ont été définie sous forme d'énumération *(EnergyType et TrainerType)*, il s’agit ici d’une liste de valeurs possible que nous allons attribuer à un type lors de la création d’une carte.

Lorsque l’utilisateur par exemple, saisie dans la variable **nameEnergy** “Plante”, celui-ci va être comparer avec un *equals* au type d'énergie énumérés dans la classe **EnergyType**, et ainsi attribuer la valeur au type d'énergie déclarer. 

Nous avons donc globalement une interface Menu puis la classe **GameConsole** permettant à l’utilisateur de choisir ce qu’il veut faire, des classes *(nom_de_la_carteType)* qui permettent d'énumérer la liste des valeurs possibles, des classes *(nom_de_la_carteCard)* qui permettent de créer l’objet selon les données saisies par l’utilisateur, ainsi qu’un paquet de carte qui va prendre en compte chaque carte crée.

# Les Méthodes principales :

* La méthode **SearchCardBy** qui va proposer à l'utilisateur de rechercher une carte selon son critère (Nom ou Id de la carte) ce qui va permettre par la suite de rechercher une carte du paquet en entrant son identifiant par exemple.

* La méthode **AllDeck** qui permet de voir le paquet de carte si celui-ci n'est pas vide.

* La méthode **updateCardDeck** qui va demander à l'utilisateur l'id de la carte, puis traiter la carte en question en lui attribuant une nouvelle variable qui va remplacer l'ancienne.

* La méthode **delCardDeck** qui va également demander l'id de la carte à l'utilisateur, puis appeller la méthode **delCard** avec l'identifiant de la carte afin de la supprimer.

* La méthode **addCardDeck** qui rajoute la carte crée par l'utilisateur dans le case.

# Problèmes rencontrés :
N’ayant pas une forte connaissance du langage Java, j’ai durant ce TP j’ai rencontré plusieurs problèmes :
La création et l’utilisation de constructeur, qui a été réaliser par la suite avec le soutien du professeur et la recherche sur des sites comme **Developpez.com** et **OpenClassroom**. 

L’appel de méthodes et leurs expressions, qui après plusieurs recherches sur internet et leur utilisation, m’a permis d’en apprendre plus dessus.

Malgré différents problèmes, la création de ce programme m’en a beaucoup appris sur le langage Java et m’a permis d’être dans la peau d’un développeur, de chercher mes erreurs sur internet et d’y remédier directement 







