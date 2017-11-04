# Le projet :
Le projet a pour but de créer un **Pokedeck** en Java qui permet de manipuler les cartes Pokémon. Nous pouvons avec ce pokedeck ajouter, supprimer ou modifier une carte Pokémon avec différents types de cartes comme des cartes Trainer, Pokémon ou bien des cartes énergies.

# Interface :
Ici la classe **Pokedeck** lance tout d'abord le **Menu**, il s’agit de l’interface principal ou l’utilisateur va pouvoir choisir entre plusieurs options *(utilisation de la classe scanner)*: 
* Ajouter une carte
* Supprimer un carte
* Mettre à jour une carte existante
* Voir le paquet de carte
* Quitter le programme

# Les classes :
La classe Menu est donc la classe principale qui sert directement d’interface avec l’utilisateur, selon le choix de l’utilisateur *(utilisation d’un switch)*. 

Si celui-ci décide d’ajouter une carte par exemple, cela va appeler la méthode askAddCard();  de la classe AddCard qui permet d’ajouter une carte.

La classe **AddCard** quant à elle, va demander à l’utilisateur quel “type” de carte veux-t il ajouté *(un Pokémon, un trainer ou bien une carte énergie)*. Selon son choix, une méthode va être appelée, si celui-ci par exemple décide de créer un pokémon, cela va lancer la méthode **askPokemonCard();** ou il pourra saisir un nom, un certain nombre de points de vie puis un type d'énergie

**A SAVOIR** : Les types d'énergies ainsi que les types de trainers ont été définie sous forme d'énumération *(EnergyType et TrainerType)*, il s’agit ici d’une liste de valeurs possible que nous allons attribuer à un type lors de la création d’une carte.

Lorsque l’utilisateur par exemple, saisie dans la variable **nameEnergy** “Plante”, celui-ci va être comparer avec un *equals* au type d'énergie énumérés dans la classe **hpEnergyType**, et ainsi attribuer la valeur au type d'énergie déclarer. 

Chaque objet est créé et stocké directement un *arrayList*, l’utilisateur peut après regarder le paquet de carte *(Classe Deck appeler lors de ce choix)*, ou cette classe va appeler un accesseur présent dans les classes *(PokemonCard, TrainerCard et EnergyCard)* afin de récupérer les cartes crées dans le ArrayList.

Nous avons donc globalement une interface Menu puis AddCard / DelCard permettant à l’utilisateur de choisir ce qu’il veut faire, des classes *(nom_de_la_carteType)* qui permettent d'énumérer la liste des valeurs possibles, des classes *(nom_de_la_carteCard)* qui permettent de créer l’objet selon les données saisies par l’utilisateur, ainsi qu’un paquet de carte qui va appeler les méthodes d’affichage des *ArrayList*

# Problèmes rencontrés :
N’ayant pas une forte connaissance du langage Java, j’ai durant ce TP j’ai rencontré plusieurs problèmes :
La création et l’utilisation de constructeur, qui a été réaliser par la suite avec le soutien du professeur et la recherche sur des sites comme **Developpez.com** et **OpenClassroom**. 
L’ajout d’une carte dans un *ArrayList* qui n’est pas encore 100% optimisé.
L’appel de méthodes et leurs expressions, qui après plusieurs recherches sur internet et leur utilisation, m’a permis d’en apprendre plus dessus.

Malgré différents problèmes, la création de ce programme m’en a beaucoup appris sur le langage Java et m’a permis d’être dans la peau d’un développeur, de chercher mes erreurs sur internet et d’y remédier directement 







