def gitUrl = 'https://github.com/shari23/shari123.git'

job('test job') {
label('jenkinsslave')
scm {
git {
remote {
name('origin')
url(gitUrl)
}
branches('master')
extensions {}
}
}
steps {
shell("""npm install
npm test""")
}
}