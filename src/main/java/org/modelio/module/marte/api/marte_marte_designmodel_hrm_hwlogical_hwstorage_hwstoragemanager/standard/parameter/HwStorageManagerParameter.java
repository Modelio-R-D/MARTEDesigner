/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.StorageResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwStorageManager_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("08c5cc01-578c-46be-b01c-c86bee8e17fe")
public class HwStorageManagerParameter extends StorageResourceParameter {
    @objid ("7a18d769-82ed-4bd7-acd0-7f1afb4d35a5")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Parameter";

    @objid ("c330cee8-a2f1-43ed-af1b-201871000868")
    public static final String HWSTORAGEMANAGER_PARAMETER_DESCRIPTION_TAGTYPE = "HwStorageManager_Parameter_description";

    @objid ("ecdbc567-0b6f-4afb-95e5-fffb0ebe1876")
    public static final String HWSTORAGEMANAGER_PARAMETER_ENDPOINTS_TAGTYPE = "HwStorageManager_Parameter_endPoints";

    @objid ("ad7488b6-f4f1-4dc9-bcbb-b2b6b80d4933")
    public static final String HWSTORAGEMANAGER_PARAMETER_FREQUENCY_TAGTYPE = "HwStorageManager_Parameter_frequency";

    @objid ("d230fa52-e3be-4044-9bd3-0d9cbb75cb50")
    public static final String HWSTORAGEMANAGER_PARAMETER_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Parameter_managedMemories";

    @objid ("245d238c-901c-4844-a125-94f9580a1eb0")
    public static final String HWSTORAGEMANAGER_PARAMETER_OWNEDHW_TAGTYPE = "HwStorageManager_Parameter_ownedHW";

    @objid ("d2155588-9c54-4d43-9133-36fb672e36c0")
    public static final String HWSTORAGEMANAGER_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Parameter_p_HW_Services";

    @objid ("d025061f-3e63-4d23-a8ef-27a8101a7d32")
    public static final String HWSTORAGEMANAGER_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwStorageManager_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("af1650c9-26aa-4298-b9df-df69b03419f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwStorageManager_Parameter >> then instantiate a {@link HwStorageManagerParameter} proxy.
     * 
     * @return a {@link HwStorageManagerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("6700a961-7a07-4397-b2f8-19d720848487")
    public static HwStorageManagerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerParameter.STEREOTYPE_NAME);
        return HwStorageManagerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerParameter} proxy from a {@link Parameter} stereotyped << HwStorageManager_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwStorageManagerParameter} proxy or <i>null</i>.
     */
    @objid ("d1c74866-0378-47e5-a6ef-ef0940c946c1")
    public static HwStorageManagerParameter instantiate(final Parameter obj) {
        return HwStorageManagerParameter.canInstantiate(obj) ? new HwStorageManagerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerParameter} proxy from a {@link Parameter} stereotyped << HwStorageManager_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwStorageManagerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8bf17e07-4748-43e4-85b8-0296b12dc259")
    public static HwStorageManagerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwStorageManagerParameter.canInstantiate(obj))
        	return new HwStorageManagerParameter(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ebff3884-eb5d-4082-939f-156d97c6a7aa")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwStorageManagerParameter other = (HwStorageManagerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("795e5ca9-3a02-4499-930d-e3b7d69318b1")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be8e0876-7c86-4275-b621-09b583aa39e9")
    public String getHwStorageManager_Parameter_description() {
        return this.elt.getTagValue(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Parameter_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6b47f31e-dad7-4e22-b124-8e69bf5e78f0")
    public List<String> getHwStorageManager_Parameter_endPoints() {
        return this.elt.getTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9ef209b-63f1-49ea-aad4-8c63a4626b6c")
    public String getHwStorageManager_Parameter_frequency() {
        return this.elt.getTagValue(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Parameter_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c31f998e-ff47-4b1c-8136-2e5c7376a67d")
    public List<String> getHwStorageManager_Parameter_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b25bf8c4-3df5-49ea-b6fc-ea26d890bdf0")
    public List<String> getHwStorageManager_Parameter_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("11f4cda8-2a8b-41cd-beab-0fbd5fc8af7c")
    public List<String> getHwStorageManager_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("85d34ac2-fffd-4fcb-8cf6-d7407d919580")
    public List<String> getHwStorageManager_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("45d46bbb-b0c1-4724-a59f-c444a47f94c4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d99c6eee-9b9f-4f19-9e60-b132b353b5f5")
    public void setHwStorageManager_Parameter_description(final String value) {
        this.elt.putTagValue(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Parameter_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1fd8680-48fa-42b2-a1e0-e495b753524c")
    public void setHwStorageManager_Parameter_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("147ed85e-2d03-4aa9-810b-8f11c590c681")
    public void setHwStorageManager_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Parameter_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01275a8d-3096-48c6-bead-d35ad246841f")
    public void setHwStorageManager_Parameter_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83661313-ba30-4fd9-8648-00e0c4fa655a")
    public void setHwStorageManager_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd8036ba-819c-4f61-944d-903b89a361a8")
    public void setHwStorageManager_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8623358f-26cb-414c-a617-95cae5bf7980")
    public void setHwStorageManager_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerParameter.MdaTypes.HWSTORAGEMANAGER_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("2c0855c6-feca-4e84-935b-454241ca5af7")
    protected HwStorageManagerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("865094c4-c603-4677-9ec8-d2d6f862b5c1")
    public static final class MdaTypes {
        @objid ("41e49588-c3b1-4915-96f3-c7941024489c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d2e701fd-aa19-4538-a1bb-9f746cc679e0")
        public static TagType HWSTORAGEMANAGER_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("01958019-c70a-497c-b3ae-9e3b32507fed")
        public static TagType HWSTORAGEMANAGER_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("631dbd05-29a3-4d04-8f2d-1bdb0d3bc861")
        public static TagType HWSTORAGEMANAGER_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8800ca9a-0ae5-437e-90e3-de7ee0488934")
        public static TagType HWSTORAGEMANAGER_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("6b2ba3d2-02dc-46fd-9883-788aeefb6980")
        public static TagType HWSTORAGEMANAGER_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("fa85ca5b-dbcd-4b7c-884f-78452c6883d4")
        public static TagType HWSTORAGEMANAGER_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("5e3848c7-0f00-4a96-8bf7-e63bea4096bc")
        public static TagType HWSTORAGEMANAGER_PARAMETER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("371f5ebb-107f-4b43-9a65-f72f4df453d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ba26d64-d914-44db-b337-7678257b23e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("440b476a-9dd6-496c-af38-2b0cfa445092")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "016eb365-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_PARAMETER_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "017377f4-0ccf-11df-8525-001302895b2b");
            HWSTORAGEMANAGER_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2e9b1e4-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2e9b1e5-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2e9b1e6-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2e9b1e7-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b2e9b1e8-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_PARAMETER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "46aa01c1-1710-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
