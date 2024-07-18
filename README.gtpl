### GitHub Stats

<p align="left">
  <picture>
    <img src="/github-metrics.svg" alt="Metrics" />
  </picture>
</p>

### ⭐ Recent Stars

{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
