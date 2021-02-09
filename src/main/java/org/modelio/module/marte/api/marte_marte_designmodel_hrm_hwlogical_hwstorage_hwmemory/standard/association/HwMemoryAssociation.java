/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwMemoryAssociation extends StorageResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwMemory_Association";

    public static final String HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE = "HwMemory_Association_adressSize";

    public static final String HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwMemory_Association_description";

    public static final String HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwMemory_Association_endPoints";

    public static final String HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE = "HwMemory_Association_frequency";

    public static final String HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE = "HwMemory_Association_memorySize";

    public static final String HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE = "HwMemory_Association_ownedHW";

    public static final String HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwMemory_Association_p_HW_Services";

    public static final String HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwMemory_Association_r_HW_Services";

    public static final String HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE = "HwMemory_Association_throughput";

    public static final String HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE = "HwMemory_Association_timings";

    /**
     * Tells whether a {@link HwMemoryAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwMemory_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwMemory_Association >> then instantiate a {@link HwMemoryAssociation} proxy.
     * 
     * @return a {@link HwMemoryAssociation} proxy on the created {@link Association}.
     */
    public static HwMemoryAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociation.STEREOTYPE_NAME);
        return HwMemoryAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociation} proxy from a {@link Association} stereotyped << HwMemory_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwMemoryAssociation} proxy or <i>null</i>.
     */
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
    public static HwMemoryAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwMemoryAssociation.canInstantiate(obj))
        	return new HwMemoryAssociation(obj);
        else
        	throw new IllegalArgumentException("HwMemoryAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Association_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Association_adressSize() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Association_description() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Association_endPoints() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Association_frequency() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Association_memorySize() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Association_ownedHW() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Association_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Association_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_Association_throughput() {
        return this.elt.getTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Association_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_Association_timings() {
        return this.elt.getTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Association_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_description(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_frequency(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Association_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_throughput(final String value) {
        this.elt.putTagValue(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Association_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_Association_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociation.MdaTypes.HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT, values);
    }

    protected HwMemoryAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_MEMORYSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_ADRESSSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_TIMINGS_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
