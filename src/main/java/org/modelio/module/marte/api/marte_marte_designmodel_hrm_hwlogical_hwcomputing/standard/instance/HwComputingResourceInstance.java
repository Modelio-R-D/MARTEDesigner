/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.ComputingResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwComputingResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac34a65a-6d9c-493e-9a1b-12c6141f3834")
public class HwComputingResourceInstance extends ComputingResourceInstance {
    @objid ("c56709dc-9814-4ea2-9436-9e06ad274035")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Instance";

    @objid ("da22090c-8bf2-4f55-b5b7-9882dec59867")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE = "HwComputingResource_Instance_description";

    @objid ("9afd560c-5384-438a-8b89-b947c2b40407")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE = "HwComputingResource_Instance_endPoints";

    @objid ("48e79662-d492-435f-aac0-80c8b8556af6")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE = "HwComputingResource_Instance_frequency";

    @objid ("c07e16e9-dbfb-4b61-ae70-5408de93bb34")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Instance_op_Frequencies";

    @objid ("8ba229b9-b779-4d15-9505-4663a3fc0d95")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE = "HwComputingResource_Instance_ownedHW";

    @objid ("6acdd2a5-7d0b-44ec-932b-6cab1a2478f6")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Instance_p_HW_Services";

    @objid ("4ead008f-535d-4f51-9c24-57326b113a5e")
    public static final String HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Instance_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwComputingResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("22ed666b-7da6-4c2b-97f8-6a91bcee15f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwComputingResource_Instance >> then instantiate a {@link HwComputingResourceInstance} proxy.
     * 
     * @return a {@link HwComputingResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("f80dd42d-adee-4888-9dfb-cc5197f29fb3")
    public static HwComputingResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceInstance.STEREOTYPE_NAME);
        return HwComputingResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceInstance} proxy from a {@link Instance} stereotyped << HwComputingResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwComputingResourceInstance} proxy or <i>null</i>.
     */
    @objid ("d0e40824-32bd-468f-84ed-7b738883613a")
    public static HwComputingResourceInstance instantiate(final Instance obj) {
        return HwComputingResourceInstance.canInstantiate(obj) ? new HwComputingResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceInstance} proxy from a {@link Instance} stereotyped << HwComputingResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwComputingResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d6f6d78-9a81-403a-b267-a687832afbca")
    public static HwComputingResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwComputingResourceInstance.canInstantiate(obj))
        	return new HwComputingResourceInstance(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("66b3fdf8-29a6-4115-b33b-e043d41e97b8")
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
        HwComputingResourceInstance other = (HwComputingResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f7028bb0-2a00-4c86-80f9-6e3ea8204295")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c3c3c65-747a-48c1-b4b9-242e372c5831")
    public String getHwComputingResource_Instance_description() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec0c4a16-62dd-4a31-b05b-6d893e47d370")
    public List<String> getHwComputingResource_Instance_endPoints() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a487c133-8851-4d3b-8baa-33e4e55f6f0e")
    public String getHwComputingResource_Instance_frequency() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Instance_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f266b04d-d62e-46e6-a929-e55ed80dd54f")
    public String getHwComputingResource_Instance_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2bcd3d59-417d-4363-8e8b-49b70f311f0b")
    public List<String> getHwComputingResource_Instance_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e8797f5-b4d8-4160-8e2d-2dfd3e418766")
    public List<String> getHwComputingResource_Instance_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Instance_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1260505d-6a91-46bb-93d9-6860f4800ef1")
    public List<String> getHwComputingResource_Instance_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("0fb4c055-020a-48fb-a9b9-bb2b1ff43b48")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d95adad2-bc56-4d01-8ff2-0691f026f813")
    public void setHwComputingResource_Instance_description(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7655fefc-aa39-419a-875f-29c1c70aa8f3")
    public void setHwComputingResource_Instance_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d68c9feb-1241-423e-a8b1-9207396f0b4f")
    public void setHwComputingResource_Instance_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Instance_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f742bd38-4576-41d5-aaa0-70628ee36fc2")
    public void setHwComputingResource_Instance_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c6336329-e65c-4b08-806d-bde0156c5940")
    public void setHwComputingResource_Instance_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a927017c-4bfd-439c-a511-488b584b5f04")
    public void setHwComputingResource_Instance_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Instance_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c04f679-b5f0-44f9-a812-1b0bccd64b5d")
    public void setHwComputingResource_Instance_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceInstance.MdaTypes.HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("2ca99206-caf9-4783-9cc2-08ffb982b862")
    protected HwComputingResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("952041e6-8ff0-4e97-b4b8-edf38dd557e1")
    public static final class MdaTypes {
        @objid ("405f7553-b32b-4b1c-90a9-23db5d81ac02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce3bf1f0-6d23-4358-baf2-bf683b0ed64b")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("ceaffcff-4b9c-4ca4-8849-e82e5eefa019")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("d20ae260-58e3-4e95-b6da-3cff5afadf21")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("92b3f82f-0e6b-46f9-94a5-baf4a4def7f5")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cabc0c3b-0a46-464f-a5e2-cc26816d01ed")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT;

        @objid ("5467d3e6-fd79-422c-abb3-f6e00b8b795d")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT;

        @objid ("5fa2d1e8-ddeb-4dc4-bc11-49c5b8e76b9b")
        public static TagType HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("b8f79ec6-117e-4d76-a5b4-7f2651767a37")
        private static Stereotype MDAASSOCDEP;

        @objid ("67d489eb-43ad-473f-b35e-6f5275baa5f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f828740-9d52-4582-988e-0b4b2dc7b7f9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed6-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_INSTANCE_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cc2-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_INSTANCE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafb-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fafe-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13faff-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_INSTANCE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3d13fb00-1623-11df-b9be-0014222a9f79");
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
