/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3be2ec59-5016-4e4a-9cde-64c2bcc1ec31")
public class HwResourceInstance {
    @objid ("6bf5e77a-0995-49d6-ab8e-e0eef7ad803d")
    public static final String STEREOTYPE_NAME = "HwResource_Instance";

    @objid ("055fec42-1238-41cb-96c9-a553a997c398")
    public static final String HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwResource_Instance_description";

    @objid ("1a4338db-9276-44f3-a790-085aea80e247")
    public static final String HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwResource_Instance_endPoints";

    @objid ("c1fe08c1-89e2-4f06-8514-f6e143dc4a4a")
    public static final String HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwResource_Instance_frequency";

    @objid ("b8fc19e3-904a-4180-a59f-fc57662c0105")
    public static final String HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwResource_Instance_ownedHW";

    @objid ("7700f705-d013-45cb-8f29-acda0f5be6fd")
    public static final String HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwResource_Instance_p_HW_Services";

    @objid ("dc048a2f-c3e8-4aae-b6b5-c194e541b707")
    public static final String HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwResource_Instance_r_HW_Services";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("0df009a9-afca-4e92-b539-1ba93e0e4892")
    protected final Instance elt;

    /**
     * Tells whether a {@link HwResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("24221ebf-a8b3-48c7-b363-3d98c31cdbec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwResource_Instance >> then instantiate a {@link HwResourceInstance} proxy.
     * 
     * @return a {@link HwResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("fba9a0d8-80cb-44bc-a8bf-fac13fb0300a")
    public static HwResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceInstance.STEREOTYPE_NAME);
        return HwResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceInstance} proxy from a {@link Instance} stereotyped << HwResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwResourceInstance} proxy or <i>null</i>.
     */
    @objid ("0a47fca2-b99b-4001-b5b4-4774b1c98a14")
    public static HwResourceInstance instantiate(final Instance obj) {
        return HwResourceInstance.canInstantiate(obj) ? new HwResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceInstance} proxy from a {@link Instance} stereotyped << HwResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5b501de2-345d-452a-b9f9-57eec0822f3b")
    public static HwResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwResourceInstance.canInstantiate(obj))
        	return new HwResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ff29456-8614-4161-8e79-ee7f221f4796")
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
        HwResourceInstance other = (HwResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("41b6e36c-0766-49b0-8da3-232021b43baa")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'HwResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("56e2229f-ee8e-4bb4-950c-c1bb2c32b568")
    public String getHwResource_Instance_description() {
        return this.elt.getTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("de4140a8-613f-45b9-b202-abb2174dd8cb")
    public List<String> getHwResource_Instance_endPoints() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27c549df-ff2e-4945-a88b-75d2be77844d")
    public String getHwResource_Instance_frequency() {
        return this.elt.getTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d32ee07d-4c5d-4c81-9494-4a58b5885527")
    public List<String> getHwResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("631f88da-e9a6-42f0-8875-6b0fbe7070e2")
    public List<String> getHwResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fc43e26c-a0ad-4c6a-9840-81441b671eaa")
    public List<String> getHwResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("96a37007-ae04-456d-811c-403902f412b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7cb8f6c-6de9-41e2-9774-92d24c1d1cd5")
    public void setHwResource_Instance_description(final String value) {
        this.elt.putTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1bf8e9c4-9458-4f35-9344-849715070074")
    public void setHwResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eda6f079-545b-452f-bef4-0c7a63bf15c1")
    public void setHwResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("940199ae-e7ea-4a8a-ad28-71db3d465c2e")
    public void setHwResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("23aa9241-408c-4b76-96f0-f9361a427163")
    public void setHwResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ef4e79a-d003-420d-a1a2-e97e31be994e")
    public void setHwResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceInstance.MdaTypes.HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("6a1e98e1-f2d6-4e82-879d-3596a81db9b7")
    protected HwResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("01c7e2fa-d1c6-427b-9125-b7ebc0a56126")
    public static final class MdaTypes {
        @objid ("a28b1ef8-c708-4c39-b01c-cd4ad66605c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ef322e0-0c88-4dbe-a6d2-fa6775ef6863")
        public static TagType HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("26f7ed46-790c-463c-b75b-6c2b0f83ec4d")
        public static TagType HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("20ff1c16-6f37-4e75-8417-6e981c1caca2")
        public static TagType HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ae824170-2f89-4acc-967b-2e4c62b635e2")
        public static TagType HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("e972c02b-58ba-4c85-9be8-a5eb3c61ea7d")
        public static TagType HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("17177af1-d04e-4b59-82ec-1bc4be14d858")
        public static TagType HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("e40f0c6b-83b8-49c6-9b41-9e974101f009")
        private static Stereotype MDAASSOCDEP;

        @objid ("57c315a5-1264-4bfd-84cc-81a8d98233b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e44b7e5-d711-404b-8874-eb025980d2de")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae379-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff69-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff70-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff77-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff7e-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d134d0fe-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "305cf54d-1709-11df-b92a-0014222a9f79");
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
