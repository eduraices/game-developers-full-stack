
db.createUser(
    {
        user : "jesus",
        pwd : "jesus",
        roles : [
            {
                role : "readWrite",
                db : "games"
            }
        ]
    }
)

db.createUser(
    {
        user : "dev",
        pwd : "dev",
        roles : [
            {
                role : "root",
                db : "admin"
            },
            {
                role : "readWrite",
                db : "games"
            }
            
        ]
    }
)

