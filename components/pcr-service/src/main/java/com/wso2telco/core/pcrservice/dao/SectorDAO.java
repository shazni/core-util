/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.wso2telco.core.pcrservice.dao;


import java.sql.SQLException;

import com.wso2telco.core.pcrservice.model.SectorDTO;
import org.skife.jdbi.v2.DBI;

/**
 * The Class SectorDAO.
 */
public class SectorDAO {

	/**
	 * Save new sector.
	 *
	 * @param sectorDTO the sector DTO
	 * @return the int
	 * @throws SQLException the SQL exception
	 */
    public int saveNewSector(SectorDTO sectorDTO) throws SQLException{
        DBI dbi = JDBIUtil.getInstance();
        SectorHandler sectorHandler = dbi.onDemand(SectorHandler.class);

        return sectorHandler.createNewSector(sectorDTO);
    }

	/**
	 * Check sector exists.
	 *
	 * @param sectorDTO the sectorDTO
	 * @return true, if successful
	 * @throws SQLException the SQL exception
	 */
    public boolean checkSectorExist(SectorDTO sectorDTO) throws SQLException{
        DBI dbi = JDBIUtil.getInstance();
        SectorHandler sectorHandler = dbi.onDemand(SectorHandler.class);

        return sectorHandler.checkSectorExists(sectorDTO);
    }
}
