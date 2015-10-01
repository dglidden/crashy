<html>
    <head>
        <title>Crashy!</title>
    </head>
    <body>
        <form action="/crashy/crash" method="post">
            <select name="dowhat">
                <option value="crash">Crash Me</option>
                <option value="log">Write Some Log Messages</option>
            </select>
            <input type="submit" value="Crash!"/>
        </form>
    </body>
</html>
