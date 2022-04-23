import postgres from 'postgres'

const options = {
  host: 'ec2-54-83-21-198.compute-1.amazonaws.com',
  database: 'ddb1f37ahbs315',
  user: 'olggbngfmlxxbj',
  password: 'e992f7481dc25df52341d58e818812daccd1ef1db629000df69efd51f812b541',
}
const address = `postgres://${options.user}:${options.password}@${options.host}:5432/${options.database}`

const sql = postgres(address) // will use psql environment variables

const test = async () => {
  try {
    const user = await sql`select * from jugadores`
    console.log(user)
  } catch (e) {
    console.log(e)
  }
}

test()
export default sql
