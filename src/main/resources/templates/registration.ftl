<#import "parts/common.ftl" as c>

<@c.common>
            <form method="post" action="/registration/">
                <h2>Registration form</h2>
                <div class="form-group row">
                    <label for="username" class="col-sm-2 col-form-label">Username</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="userName" id="username" placeholder="Enter username" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pass" class="col-sm-2 col-form-label">Password</label>
                    <div class="col-sm-6">
                        <input type="password" class="form-control" name="password" id="pass" placeholder="Password">
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Create account</button>
                <a class="nav-link" href="/registration/">Sign in</a>
            </form>
</@c.common>