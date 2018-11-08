<#import "parts/common.ftl" as c>

<@c.common>
    <div class="card-columns">
        <#list givens as given>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">${given.disk.name}</h5>
                    <h6 class="card-subtitle mb-2 text-muted">It's you disk - ${given.disk.user.username}</h6>
                    <p class="card-text">This disk take user by username - ${given.user.username} and you give it.</p>
                </div>
            </div>
        <#else>
            No disks
        </#list>
    </div>
</@c.common>