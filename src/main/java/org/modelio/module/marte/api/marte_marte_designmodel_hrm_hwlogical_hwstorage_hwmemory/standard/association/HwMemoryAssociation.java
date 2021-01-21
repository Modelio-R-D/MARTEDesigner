/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.StorageResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwMemory_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ade2ba69-d66e-48fa-815f-8fd4167450ad")
public class HwMemoryAssociation extends StorageResourceAssociation {
    @objid ("08632c46-6c29-47ee-9fc0-9ab3e3d14f03")
    public static final String STEREOTYPE_NAME = "HwMemory_Association";

    @objid ("c8cc47e4-4222-48f1-9e98-88f553ebad27")
    public static final String HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE = "HwMemory_Association_adressSize";

    @objid ("f27abff7-bec0-4f8d-bb37-ec19032f23b5")
    public static final String HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwMemory_Association_description";

    @objid ("9f4185d4-e315-46e8-a61a-dfb693519f0a")
    public static final String HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwMemory_Association_endPoints";

    @objid ("247f855b-6a01-44c7-917d-9e122626fd10")
    public static final String HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE = "HwMemory_Association_frequency";

    @objid ("6d3b66a5-428d-46a2-880f-60e23ecb058d")
    public static final String HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE = "HwMemory_Association_memorySize";

    @objid ("ba7122c0-31e8-4999-b925-d965f15cabec")
    public static final String HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE = "HwMemory_Association_ownedHW";

    @objid ("89dd4401-dfa9-4280-85e4-c35d34db27c4")
    public static final String HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwMemory_Association_p_HW_Services";

    @objid ("cdad2780-49bf-4471-bcde-2d87455d0b45")
    public static final String HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwMemory_Association_r_HW_Services";

    @objid ("f6ed5cc7-43df-44cf-a779-03e5e869acf5")
    public static final String HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE = "HwMemory_Association_throughput";

    @objid ("050862ee-c291-42c6-993e-2e502b69062f")
    public static final String HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE = "HwMemory_Association_timings";

    /**
     * Tells whether a {@link HwMemoryAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMemory_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d28bde2e-7da5-45dc-b168-5e53db144a3b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMemory_Association >> then instantiate a {@link HwMemoryAssociation} proxy.
     * 
     * @return a {@link HwMemoryAssociation} proxy on the created {@link Association}.
     */
    @objid ("8f4b85a2-5328-46ca-9833-3556b9c8f065")
    public static HwMemoryAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociation.STEREOTYPE_NAME);
        return HwMemoryAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociation} proxy from a {@link Association} stereotyped << HwMemory_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwMemoryAssociation} proxy or <i>null</i>.
     */
    @objid ("e5bf5cf3-a6ab-4804-9c08-e1ce34264366")
    public static HwMemoryAssociation instantiate(final Association obj) {
        return HwMemoryAssociation.canInstantiate(obj) ? new HwMemoryAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociation} proxy from a {@link Association} stereotyped << HwMemory_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwMemoryAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("68e09191-acf3-447f-ad9c-8a0f9cbcf2d4")
    public static HwMemoryAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMemoryAssociation.canInstantiate(obj))
        	return new HwMemoryAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMemoryAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b3048bf7-1d85-4a6f-8846-0d8816c2f946")
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
        HwMemoryAssociation other = (HwMemoryAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("9e8fc023-9fc1-451d-8332-434cdc6638cc")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Association_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b33c0e4c-78d2-41eb-977b-d8a7b58eb0b1")
    public String getHwMemory_Association_adressSize() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("232e8756-b999-4ab0-a683-b85cc345f9bd")
    public String getHwMemory_Association_description() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f23fd594-3701-4f65-aea7-7f80d3feb8ac")
    public List<String> getHwMemory_Association_endPoints() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03694e1f-7951-491d-b5d7-d8c559761ae1")
    public String getHwMemory_Association_frequency() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5eb9ded-cc83-49f0-8fa1-e10aff432aca")
    public String getHwMemory_Association_memorySize() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2009f921-e4e4-4431-9b15-5655b077730b")
    public List<String> getHwMemory_Association_ownedHW() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9baf3da0-4fc6-4c09-870d-60e77e42c145")
    public List<String> getHwMemory_Association_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("02493b10-b9cf-40d0-8e63-2b18ae3ccfb1")
    public List<String> getHwMemory_Association_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbdc6d0b-6db5-4040-bccd-6171b3b61901")
    public String getHwMemory_Association_throughput() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("66ad18d5-c733-4b1c-abcb-ecbadeffc749")
    public List<String> getHwMemory_Association_timings() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("16e33cf6-9b07-4f6a-87d9-780c79296145")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Association_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("625b5c64-c5e6-41f6-a8b4-d886b29b0a9a")
    public void setHwMemory_Association_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c26c0931-5bf4-4c14-9d0f-8d9019462058")
    public void setHwMemory_Association_description(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dff54df3-66b8-4a41-8445-9d9cae99ca94")
    public void setHwMemory_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa865b00-d8b3-4fa0-b9ed-2b94f186b87b")
    public void setHwMemory_Association_frequency(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Association_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b001d517-8bf3-4e08-a41f-8252c0f1c47f")
    public void setHwMemory_Association_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d79dea22-7f20-477d-973d-28d68e09feb1")
    public void setHwMemory_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("905f2813-0ba8-48aa-b2ad-f012ea2cdb90")
    public void setHwMemory_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f6e42ac-596e-4a06-8978-c110758b6056")
    public void setHwMemory_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb477a98-ef2f-4907-832d-5210328de1aa")
    public void setHwMemory_Association_throughput(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b211c45-080c-4302-a6bc-6331f0f90f7f")
    public void setHwMemory_Association_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("18afcb7a-4f70-4ad1-aeca-7e4061af18bb")
    protected HwMemoryAssociation(final Association elt) {
        super(elt);
    }

    @objid ("f5f5fcfa-237d-453b-8f36-90a39f219b7a")
    public static final class MdaTypes {
        @objid ("11b2bd81-ad3a-4861-be10-b748f76d22b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e296d3b-4b73-4a6f-a703-d22c6d2b33ce")
        public static TagType HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("e40eba9a-17b4-4d18-8efa-9c682051c7b8")
        public static TagType HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("a1dc830f-a4f0-49bc-88b7-4b2443067c13")
        public static TagType HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT;

        @objid ("c31536d6-322a-4657-a1fd-484fe4f0bf47")
        public static TagType HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        @objid ("74884e36-e55e-4dcd-ba26-8cc60e85e978")
        public static TagType HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("5ccaef46-8a35-471e-8616-013f9db05b1a")
        public static TagType HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("b74493c9-0150-452f-bbbd-206faa769645")
        public static TagType HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("dd447fb0-3caf-4a28-98c8-d6a3884c11c9")
        public static TagType HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("c377a93f-6a5f-4973-a672-87d45db6e5f2")
        public static TagType HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("ac10afd2-4c0f-423c-8e3b-bf113f62d0e1")
        public static TagType HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("3f1b3a28-fe24-4e9e-9a93-f3a9e5b9bf97")
        private static Stereotype MDAASSOCDEP;

        @objid ("60b20df1-69da-457f-9cb9-57f56195a6ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d11a17f2-aefb-445a-a85c-ce28d130a1ed")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dbcf71a3-1004-11df-86fe-0014222a9f79");
            HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "038f581f-1005-11df-86fe-0014222a9f79");
            HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "038f5820-1005-11df-86fe-0014222a9f79");
            HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "038f5821-1005-11df-86fe-0014222a9f79");
            HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "038f5822-1005-11df-86fe-0014222a9f79");
            HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6c4a4de-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6c4a4df-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6c4a4e0-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6c4a4e1-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6c4a4e2-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0aeeb095-170f-11df-b92a-0014222a9f79");
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
