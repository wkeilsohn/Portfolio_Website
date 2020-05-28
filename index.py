# Import from Flask
from flask import Flask, render_template, render_template_string, request, url_for, Markup
from py4j.java_gateway import JavaGateway

# Define App
app = Flask(__name__)

gateway = JavaGateway()

# Define Routes
@app.route('/')
def renderPage():
    git_repo_table = gateway.entry_point.outGitrepo_main()
    git_repo_table = Markup(git_repo_table)
    return render_template('home.html', git_repo_table = git_repo_table)

# Run Application
if __name__ == '__main__':
    app.run(debug=True)
