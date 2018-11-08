<#import "parts/common.ftl" as c>

<@c.common>
    <div class="card-columns">
        <#list disks as disk>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${disk.name}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">${disk.user.username}</h6>
                    <p class="card-text">This disk have name - ${disk.name} and owner of this disk user ${disk.user.username}</p>
                    <form action="/disk/take/#{disk.id}" method="post">
                        <button type="submit" class="btn btn-primary">Take</button></a>
                    </form>
                </div>
            </div>
            <#else>
            No disks
        </#list>
    </div>
</@c.common>