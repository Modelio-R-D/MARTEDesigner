/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.StorageResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwMemory_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwMemoryAssociationEnd extends StorageResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwMemory_AssociationEnd";

    public static final String HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE = "HwMemory_AssociationEnd_adressSize";

    public static final String HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwMemory_AssociationEnd_description";

    public static final String HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwMemory_AssociationEnd_endPoints";

    public static final String HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwMemory_AssociationEnd_frequency";

    public static final String HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE = "HwMemory_AssociationEnd_memorySize";

    public static final String HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwMemory_AssociationEnd_ownedHW";

    public static final String HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwMemory_AssociationEnd_p_HW_Services";

    public static final String HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwMemory_AssociationEnd_r_HW_Services";

    public static final String HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "HwMemory_AssociationEnd_throughput";

    public static final String HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE = "HwMemory_AssociationEnd_timings";

    /**
     * Tells whether a {@link HwMemoryAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >> then instantiate a {@link HwMemoryAssociationEnd} proxy.
     * 
     * @return a {@link HwMemoryAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwMemoryAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociationEnd.STEREOTYPE_NAME);
        return HwMemoryAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwMemoryAssociationEnd} proxy or <i>null</i>.
     */
    public static HwMemoryAssociationEnd instantiate(final AssociationEnd obj) {
        return HwMemoryAssociationEnd.canInstantiate(obj) ? new HwMemoryAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwMemoryAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwMemoryAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwMemoryAssociationEnd.canInstantiate(obj))
        	return new HwMemoryAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwMemoryAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwMemoryAssociationEnd other = (HwMemoryAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_AssociationEnd_adressSize() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_AssociationEnd_description() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_AssociationEnd_memorySize() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwMemory_AssociationEnd_throughput() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwMemory_AssociationEnd_timings() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_throughput(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwMemory_AssociationEnd_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT, values);
    }

    protected HwMemoryAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "014af082-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52d4-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52db-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014d52e2-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "014fb52b-0ccf-11df-8525-001302895b2b");
            HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba80b6fa-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba80b6fb-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba80b6fc-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba831956-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ba831957-162d-11df-b9be-0014222a9f79");
            HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0418accd-170f-11df-b92a-0014222a9f79");
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
