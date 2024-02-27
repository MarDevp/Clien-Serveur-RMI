-Le serveur RMI implémente une interface qui étend java.rmi.Remote et doit déclarer une exception RemoteExce-ption.

-La méthode convertirChaine est définie dans l’interface et est implémentée dans le serveur RMI.
-Le serveur RMI est enregistré auprès du registre RMI à l’aide de Naming.rebind().
-Le client RMI recherche le serveur RMI dans le registre RMI à l’aide de Naming.lookup() et appelle la méthode convertirChaine.

Génération de souches (stubs) :
 -Il n’est pas nécessaire de générer les souches (stubs) manuellement car dans les versions récentes de Java (Java 5 et ultérieures), elles sont générées automatiquement.


Serveur de noms RMI :
-Le port par défaut pour le serveur de noms RMI est le port 1099.
