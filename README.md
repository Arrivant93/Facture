![diagram-export-15-10-2024-19_21_52](https://github.com/user-attachments/assets/bf946f47-c039-46bb-9452-06dc1420c507)

#Reponse

Lors de la création d’une facture, le système doit collecter les informations de chaque produit, ainsi que le taux de TVA. Ces données doivent ensuite être enregistrées dans la table des lignes de facture afin de garantir que la facture reste inchangée face à d’éventuelles variations de prix.

On doit avoir une table dédiée à la TVA. Au moment de générer une facture, le système devra vérifier le taux à la date de facturation pour chaque produit. La table des produits devra se mettre à jour avec les nouveaux prix et taux de TVA sans affecter les factures antérieures.

De plus, un client peut avoir plusieurs factures, chacune étant enregistrée avec un nom, une date et une heure de création. Cela permet d’avoir différentes factures affichant des prix et des taux de TVA variés.
