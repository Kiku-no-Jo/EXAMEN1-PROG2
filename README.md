# EXAMEN1-PROG2
1/ @override indique que l'on va surcharger une méthode de la classe parent.

2/Deux objets égaux doivent avoir la même valeur de hachage tant qu'ils restent égaux mais deux objets non égaux n'ont pas l'obligation d'avoir des valeurs de hachage distinctes. Pour respecter ces deux règles, il est nécessaire de redéfinir la méthode hashCode() lorsque la méthode equals() est redéfinie.

3/Le polymorphisme statique désigne plusieurs methodes qui ont le même nom mais qui possède différents paramètres. Comme illustration prenons le cas d'un constructeur de joueur de foot, premièrement on crée un constructeur où les attributs mis sont complet, et pour l'autre on peut enlever un attribut. Alors là on peut constater que ces deux méthodes possèdent le même nom mais possèdent différents paramètres.