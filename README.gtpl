### GitHub Stats

<p align="left">
  <picture>
    <img src="/github-metrics.svg" alt="Metrics" />
  </picture>
</p>

### 📓 Recent Gists

{{ range gists 10 }}
- [{{ .Description }}]({{ .URL }}) ({{ humanize .CreatedAt }})
{{- end }}

### 🌱 Recent Repositories

{{ range recentRepos 10 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### ⭐ Recent Stars

{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
