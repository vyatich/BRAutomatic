<#import "parts/common.ftl" as c>

<@c.common>
    <div class="card-columns">
        <#list taken as t>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${t.disk.name}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Owner - ${t.disk.user}</h6>
                    <p class="card-text">It's a disk by user ${t.disk.user} and you take is. </p>
                    <a href="#" class="card-link">Take</a>
                </div>
            </div>
        <#else>
            No disks
        </#list>
    </div>
</@c.common>