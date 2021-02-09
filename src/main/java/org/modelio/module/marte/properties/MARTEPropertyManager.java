package org.modelio.module.marte.properties;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.module.marte.profile.editors.IPropertyContent;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class MARTEPropertyManager {
    private boolean isFromProfile(String namePro, Stereotype ste) {
        return  ste.getOwner().getName().equals(namePro);
    }

    public int changeProperty(ModelElement obmo, int row, String value) {
        List<Stereotype> sterList = ModelUtils.computePropertyList(obmo);
        
        for (Stereotype ste : sterList){
            if (row > 0){
                if (isFromProfile("MARTE.MARTE_Foundations.Alloc", ste)){
                    IPropertyContent contentAlloc = org.modelio.module.marte.profile.alloc.propertys.PropertyManager.getPalette(ste);
                    if(contentAlloc != null){
                        contentAlloc.changeProperty(obmo, row, value);
                    }
                }
        
                if (isFromProfile("MARTE.MARTE_Foundations.CoreElements", ste)){
                    IPropertyContent contentCoreElements = org.modelio.module.marte.profile.coreelements.propertys.PropertyManager.getPalette(ste);
                    if(contentCoreElements != null){
                        contentCoreElements.changeProperty(obmo, row, value);
                    }
                }
        
                if (isFromProfile("MARTE.MARTE_Annexes.VSL.DataTypes", ste)){
                    IPropertyContent contentDataTypes = org.modelio.module.marte.profile.datatypes.propertys.PropertyManager.getPalette(ste);
                    if(contentDataTypes != null){
                        contentDataTypes.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("Extentions", ste)){
                    IPropertyContent contentExtentions = org.modelio.module.marte.profile.extentions.propertys.PropertyManager.getPalette(ste);
                    if(contentExtentions != null){
                        contentExtentions.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.GCM", ste)){
                    IPropertyContent contentGcm = org.modelio.module.marte.profile.gcm.propertys.PropertyManager.getPalette(ste);
                    if(contentGcm != null){
                        contentGcm.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_AnalysisModel.GQAM", ste)){
                    IPropertyContent contentGqam = org.modelio.module.marte.profile.gqam.propertys.PropertyManager.getPalette(ste);
                    if(contentGqam != null){
                        contentGqam.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_AnalysisModel.SAM", ste)){
                    IPropertyContent contentSam = org.modelio.module.marte.profile.sam.propertys.PropertyManager.getPalette(ste);
                    if(contentSam != null){
                        contentSam.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_AnalysisModel.PAM", ste)){
                    IPropertyContent contentPam = org.modelio.module.marte.profile.pam.propertys.PropertyManager.getPalette(ste);
                    if(contentPam != null){
                        contentPam.changeProperty(obmo, row, value);
                    }
                }
        
                if (isFromProfile("MARTE.MARTE_Foundations.GRM", ste)){
                    IPropertyContent contentGrm = org.modelio.module.marte.profile.grm.propertys.PropertyManager.getPalette(ste);
                    if(contentGrm != null){
                        contentGrm.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HLAM", ste)){
                    IPropertyContent contentHlam = org.modelio.module.marte.profile.hlam.propertys.PropertyManager.getPalette(ste);
                    if(contentHlam != null){
                        contentHlam.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication", ste)){
                    IPropertyContent contentHwCommunication = org.modelio.module.marte.profile.hwcommunication.propertys.PropertyManager.getPalette(ste);
                    if(contentHwCommunication != null){
                        contentHwCommunication.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing", ste)){
                    IPropertyContent contentHwComputing = org.modelio.module.marte.profile.hwcomputing.propertys.PropertyManager.getPalette(ste);
                    if(contentHwComputing != null){
                        contentHwComputing.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice", ste)){
                    IPropertyContent contentHwDevice = org.modelio.module.marte.profile.hwdevice.propertys.PropertyManager.getPalette(ste);
                    if(contentHwDevice != null){
                        contentHwDevice.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwGeneral", ste)) {
                    IPropertyContent contentHwGeneral = org.modelio.module.marte.profile.hwgeneral.propertys.PropertyManager.getPalette(ste);
                    if(contentHwGeneral != null){
                        contentHwGeneral.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout", ste)) {
                    IPropertyContent contentHwLayout = org.modelio.module.marte.profile.hwlayout.propertys.PropertyManager.getPalette(ste);
                    if(contentHwLayout != null){
                        contentHwLayout.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory", ste)) {
                    IPropertyContent contentHwMemory = org.modelio.module.marte.profile.hwmemory.propertys.PropertyManager.getPalette(ste);
                    if(contentHwMemory != null){
                        contentHwMemory.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower", ste)) {
                    IPropertyContent contentHwPower = org.modelio.module.marte.profile.hwpower.propertys.PropertyManager.getPalette(ste);
                    if(contentHwPower != null){
                        contentHwPower.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager", ste)) {
                    IPropertyContent contentHwStorageManager = org.modelio.module.marte.profile.hwstoragemanager.propertys.PropertyManager.getPalette(ste);
                    if(contentHwStorageManager != null){
                        contentHwStorageManager.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming", ste)) {
                    IPropertyContent contentHwTiming = org.modelio.module.marte.profile.hwtiming.propertys.PropertyManager.getPalette(ste);
                    if(contentHwTiming != null){
                        contentHwTiming.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_Foundations.NFPs", ste)) {
                    IPropertyContent contentNfps = org.modelio.module.marte.profile.nfps.propertys.PropertyManager.getPalette(ste);
                    if(contentNfps != null){
                        contentNfps.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Brokering", ste)) {
                    IPropertyContent contentSwBrokering = org.modelio.module.marte.profile.sw_brokering.propertys.PropertyManager.getPalette(ste);
                    if(contentSwBrokering != null){
                        contentSwBrokering.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Concurrency", ste)) {
                    IPropertyContent contentSwConcurrency = org.modelio.module.marte.profile.sw_concurrency.propertys.PropertyManager.getPalette(ste);
                    if(contentSwConcurrency != null){
                        contentSwConcurrency.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Interaction", ste)) {
                    IPropertyContent contentSwInteraction = org.modelio.module.marte.profile.sw_interaction.propertys.PropertyManager.getPalette(ste);
                    if(contentSwInteraction != null){
                        contentSwInteraction.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_ResourceCore", ste)) {
                    IPropertyContent contentSwResourceCore = org.modelio.module.marte.profile.sw_resourcecore.propertys.PropertyManager.getPalette(ste);
                    if(contentSwResourceCore != null){
                        contentSwResourceCore.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_Foundations.Time", ste)) {
                    IPropertyContent contentTime = org.modelio.module.marte.profile.time.propertys.PropertyManager.getPalette(ste);
                    if(contentTime != null){
                        contentTime.changeProperty(obmo, row, value);
                    }
                }
                if (isFromProfile("MARTE.MARTE_Annexes.VSL.Variables", ste)) {
                    IPropertyContent contentVariables = org.modelio.module.marte.profile.variables.propertys.PropertyManager.getPalette(ste);
                    if(contentVariables != null){
                        contentVariables.changeProperty(obmo, row, value);
                    }
                }
        
                if (isFromProfile("MARTE.MARTE_Annexes.RSM", ste)) {
                    IPropertyContent contentVariables = org.modelio.module.marte.profile.rsm.propertys.PropertyManager.getPalette(ste);
                    if(contentVariables != null){
                        contentVariables.changeProperty(obmo, row, value);
                    }
                }
        
                row  = row - ste.getDefinedTagType().size();
                row  = row - ste.getDefinedNoteType().size();
            }
        }
        return row;
    }

    public void update(ModelElement obmo, IModulePropertyTable table) {
        List<Stereotype> sterList = ModelUtils.computePropertyList(obmo);
        
        for (Stereotype ste : sterList){
        
            if (isFromProfile("MARTE.MARTE_Foundations.Alloc", ste)){
                IPropertyContent contentAlloc = org.modelio.module.marte.profile.alloc.propertys.PropertyManager.getPalette(ste);
                if(contentAlloc != null){
                    contentAlloc.update(obmo, table);
                }
            }
        
            if (isFromProfile("MARTE.MARTE_Foundations.CoreElements", ste)) {
                IPropertyContent contentCoreElements = org.modelio.module.marte.profile.coreelements.propertys.PropertyManager.getPalette(ste);
                if(contentCoreElements != null){
                    contentCoreElements.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Annexes.VSL.DataTypes", ste)) {
                IPropertyContent contentDataTypes = org.modelio.module.marte.profile.datatypes.propertys.PropertyManager.getPalette(ste);
                if(contentDataTypes != null){
                    contentDataTypes.update(obmo, table);
                }
            }
            if (isFromProfile("Extentions",ste)) {
                IPropertyContent contentExtentions = org.modelio.module.marte.profile.extentions.propertys.PropertyManager.getPalette(ste);
                if(contentExtentions != null){
                    contentExtentions.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.GCM", ste)) {
                IPropertyContent contentGcm = org.modelio.module.marte.profile.gcm.propertys.PropertyManager.getPalette(ste);
                if(contentGcm != null){
                    contentGcm.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_AnalysisModel.GQAM", ste)) {
                IPropertyContent contentGqam = org.modelio.module.marte.profile.gqam.propertys.PropertyManager.getPalette(ste);
                if(contentGqam != null){
                    contentGqam.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_AnalysisModel.SAM", ste)) {
                IPropertyContent contentSam = org.modelio.module.marte.profile.sam.propertys.PropertyManager.getPalette(ste);
                if(contentSam != null){
                    contentSam.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_AnalysisModel.PAM", ste)) {
                IPropertyContent contentPam = org.modelio.module.marte.profile.pam.propertys.PropertyManager.getPalette(ste);
                if(contentPam != null){
                    contentPam.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Foundations.GRM", ste)) {
                IPropertyContent contentGrm = org.modelio.module.marte.profile.grm.propertys.PropertyManager.getPalette(ste);
                if(contentGrm != null){
                    contentGrm.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HLAM", ste)) {
                IPropertyContent contentHlam = org.modelio.module.marte.profile.hlam.propertys.PropertyManager.getPalette(ste);
                if(contentHlam != null){
                    contentHlam.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication", ste)) {
                IPropertyContent contentHwCommunication = org.modelio.module.marte.profile.hwcommunication.propertys.PropertyManager.getPalette(ste);
                if(contentHwCommunication != null){
                    contentHwCommunication.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing", ste)) {
                IPropertyContent contentHwComputing = org.modelio.module.marte.profile.hwcomputing.propertys.PropertyManager.getPalette(ste);
                if(contentHwComputing != null){
                    contentHwComputing.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice", ste)) {
                IPropertyContent contentHwDevice = org.modelio.module.marte.profile.hwdevice.propertys.PropertyManager.getPalette(ste);
                if(contentHwDevice != null){
                    contentHwDevice.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwGeneral", ste)) {
                IPropertyContent contentHwGeneral = org.modelio.module.marte.profile.hwgeneral.propertys.PropertyManager.getPalette(ste);
                if(contentHwGeneral != null){
                    contentHwGeneral.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout", ste)) {
                IPropertyContent contentHwLayout = org.modelio.module.marte.profile.hwlayout.propertys.PropertyManager.getPalette(ste);
                if(contentHwLayout != null){
                    contentHwLayout.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory", ste)) {
                IPropertyContent contentHwMemory = org.modelio.module.marte.profile.hwmemory.propertys.PropertyManager.getPalette(ste);
                if(contentHwMemory != null){
                    contentHwMemory.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower", ste)) {
                IPropertyContent contentHwPower = org.modelio.module.marte.profile.hwpower.propertys.PropertyManager.getPalette(ste);
                if(contentHwPower != null){
                    contentHwPower.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwStorageManager", ste)) {
                IPropertyContent contentHwStorageManager = org.modelio.module.marte.profile.hwstoragemanager.propertys.PropertyManager.getPalette(ste);
                if(contentHwStorageManager != null){
                    contentHwStorageManager.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming", ste)) {
                IPropertyContent contentHwTiming = org.modelio.module.marte.profile.hwtiming.propertys.PropertyManager.getPalette(ste);
                if(contentHwTiming != null){
                    contentHwTiming.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Foundations.NFPs", ste)) {
                IPropertyContent contentNfps = org.modelio.module.marte.profile.nfps.propertys.PropertyManager.getPalette(ste);
                if(contentNfps != null){
                    contentNfps.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Brokering", ste)) {
                IPropertyContent contentSwBrokering = org.modelio.module.marte.profile.sw_brokering.propertys.PropertyManager.getPalette(ste);
                if(contentSwBrokering != null){
                    contentSwBrokering.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Concurrency", ste)) {
                IPropertyContent contentSwConcurrency = org.modelio.module.marte.profile.sw_concurrency.propertys.PropertyManager.getPalette(ste);
                if(contentSwConcurrency != null){
                    contentSwConcurrency.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_Interaction", ste)) {
                IPropertyContent contentSwInteraction = org.modelio.module.marte.profile.sw_interaction.propertys.PropertyManager.getPalette(ste);
                if(contentSwInteraction != null){
                    contentSwInteraction.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_DesignModel.SRM.SW_ResourceCore", ste)) {
                IPropertyContent contentResCore = org.modelio.module.marte.profile.sw_resourcecore.propertys.PropertyManager.getPalette(ste);
                if(contentResCore != null){
                    contentResCore.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Foundations.Time", ste)) {
                IPropertyContent contentTime = org.modelio.module.marte.profile.time.propertys.PropertyManager.getPalette(ste);
                if(contentTime != null){
                    contentTime.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Annexes.VSL.Variables", ste)) {
                IPropertyContent contentVariables = org.modelio.module.marte.profile.variables.propertys.PropertyManager.getPalette(ste);
                if(contentVariables != null){
                    contentVariables.update(obmo, table);
                }
            }
            if (isFromProfile("MARTE.MARTE_Annexes.RSM", ste)) {
                IPropertyContent contentVariables = org.modelio.module.marte.profile.rsm.propertys.PropertyManager.getPalette(ste);
                if(contentVariables != null){
                    contentVariables.update(obmo, table);
                }
            }
        }
    }

}
