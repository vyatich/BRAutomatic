<#import "parts/common.ftl" as c>

<@c.common>
    <div class="card-columns">
        <#list taken as t>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${t.disk.name}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Owner - ${t.disk.user.username}</h6>
                    <p class="card-text">It's a disk by user ${t.disk.user.username} and you take it.</p>
                    <form action="/disk/taken/give/#{t.id}" method="post">
                        <button type="submit" class="btn btn-primary">Give back</button></a>
                    </form>
                </div>
            </div>
        <#else>
            No disks
        </#list>
    </div>
</@c.common>