import pg from 'pg';
const Client = pg.Client;

const pruebaConnection = async() => {
    const client = new Client({
        user: 'olggbngfmlxxbj',
        host: 'ec2-54-83-21-198.compute-1.amazonaws.com',
        database: 'ddb1f37ahbs315',
        password: 'e992f7481dc25df52341d58e818812daccd1ef1db629000df69efd51f812b541',
        port: 5432,
        ssl: {
            rejectUnauthorized: false
        }
    })
    await client.connect()
    const res = await client.query("select * from jugadores")
    const result = res.rows;
    await client.end()

    return result;
};

pruebaConnection().then((result) => {
    console.log(result)
});