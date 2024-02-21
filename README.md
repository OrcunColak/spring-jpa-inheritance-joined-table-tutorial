# Read Me First

The original idea is from  
https://beratyesbek.medium.com/hibernate-inheritance-composite-pk-037ac0f63962

# Joined Table

Each class in the hierarchy is mapped to its own table in the database.  
The tables are linked together through foreign key relationships to represent the inheritance relationships between the
classes.  
The superclass table contains common properties, while the subclass tables contain properties specific to each
subclass.