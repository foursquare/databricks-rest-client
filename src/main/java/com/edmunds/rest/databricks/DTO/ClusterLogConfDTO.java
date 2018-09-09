/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.DTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 *
 */
public class ClusterLogConfDTO implements Serializable {
    @JsonProperty("dbfs")
    private DbfsStorageInfoDTO dbfs;
    @JsonProperty("s3")
    private S3StorageInfoDTO s3;

    public DbfsStorageInfoDTO getDbfs() {
        return dbfs;
    }

    public void setDbfs(DbfsStorageInfoDTO dbfs) {
        this.dbfs = dbfs;
    }

    public S3StorageInfoDTO getS3() {
        return s3;
    }

    public void setS3(S3StorageInfoDTO s3) {
        this.s3 = s3;
    }
}