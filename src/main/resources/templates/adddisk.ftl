<#import "parts/common.ftl" as c>

<@c.common>
    <form method="post" action="/disk/add">
        <h2>Add new disk</h2>
        <div class="form-group row">
            <label for="pass" class="col-sm-2 col-form-label">Name of disk</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" name="name" placeholder="Name of disk">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Added</button>
    </form>
</@c.common>