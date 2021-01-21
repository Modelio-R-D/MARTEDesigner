/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
@objid ("1885e78e-0d6a-4f7f-b022-972df7798fb6")
public class HwMemoryAssociationEnd extends StorageResourceAssociationEnd {
    @objid ("caf60748-3cf4-4731-8638-430df2289bb6")
    public static final String STEREOTYPE_NAME = "HwMemory_AssociationEnd";

    @objid ("16fe164e-006e-4931-83ba-fa86b2b74b13")
    public static final String HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE = "HwMemory_AssociationEnd_adressSize";

    @objid ("b7c80852-eef9-4809-adde-9f9879d6ff5a")
    public static final String HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwMemory_AssociationEnd_description";

    @objid ("debef123-0947-4a75-b422-b2918973d478")
    public static final String HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE = "HwMemory_AssociationEnd_endPoints";

    @objid ("c2d3071f-af7b-4856-a6ef-a70327a669c0")
    public static final String HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwMemory_AssociationEnd_frequency";

    @objid ("7d7e0a8e-b636-4864-acd2-cbbc7ad4d130")
    public static final String HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE = "HwMemory_AssociationEnd_memorySize";

    @objid ("43e0bb4b-60a4-450a-812f-d23de0deb053")
    public static final String HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwMemory_AssociationEnd_ownedHW";

    @objid ("241cdec3-2a0c-404b-acb3-2d3ed6278042")
    public static final String HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwMemory_AssociationEnd_p_HW_Services";

    @objid ("ea0364df-d1f9-4c3b-9226-02737ec442d0")
    public static final String HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwMemory_AssociationEnd_r_HW_Services";

    @objid ("bcc17e37-74fc-44c8-a1cb-b89ce198e4c0")
    public static final String HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "HwMemory_AssociationEnd_throughput";

    @objid ("8652dd4c-c14c-48d7-a035-c8338b5a1c49")
    public static final String HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE = "HwMemory_AssociationEnd_timings";

    /**
     * Tells whether a {@link HwMemoryAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("439b9c6d-8cdd-4040-b1f7-fff45f7588ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >> then instantiate a {@link HwMemoryAssociationEnd} proxy.
     * 
     * @return a {@link HwMemoryAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("ab9e43f9-3aa7-4778-8720-8247bb147085")
    public static HwMemoryAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryAssociationEnd.STEREOTYPE_NAME);
        return HwMemoryAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwMemory_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwMemoryAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("f7c12b99-5e43-43ae-af61-5abc37fb0ce1")
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
    @objid ("e51ca479-4ce5-4f1c-8afb-5dfd54baf5ce")
    public static HwMemoryAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwMemoryAssociationEnd.canInstantiate(obj))
        	return new HwMemoryAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwMemoryAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5dfa4d5d-15ab-4865-a97d-7b1c5573053f")
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
    @objid ("61631f81-684b-4269-952b-711c16b73fb9")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd899720-51f6-4c98-96a2-8286c09e0bcc")
    public String getHwMemory_AssociationEnd_adressSize() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af4d9549-f430-4545-8852-e0b3d8d901c1")
    public String getHwMemory_AssociationEnd_description() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e094a583-2ae1-4082-9fce-d85b03db9218")
    public List<String> getHwMemory_AssociationEnd_endPoints() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7a02bac-bcbd-4dd6-becc-9da71dc45bd8")
    public String getHwMemory_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5efe790-4bf2-438a-8234-f440d28fce82")
    public String getHwMemory_AssociationEnd_memorySize() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a554b6bc-e4a7-47b3-8d5e-bdb5e2ce4348")
    public List<String> getHwMemory_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b4839d9f-1474-4feb-b3f6-35a16ea4ce6e")
    public List<String> getHwMemory_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("29cb0133-3dae-4e9e-ab35-d81a2df86179")
    public List<String> getHwMemory_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09bd6e5b-7ddf-4b45-ae7b-59996f51ce81")
    public String getHwMemory_AssociationEnd_throughput() {
        return this.elt.getTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_AssociationEnd_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2097c06a-f8db-4309-bab2-9d6f998d8c69")
    public List<String> getHwMemory_AssociationEnd_timings() {
        return this.elt.getTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("4c855ffa-93e5-4eff-a548-3b6657c9053b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0cee0df3-5fea-4dec-8f47-46f4eb00c6ea")
    public void setHwMemory_AssociationEnd_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8af0fcf-e88d-4824-8581-76074ed29796")
    public void setHwMemory_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("367d76ae-79b0-41b3-8837-7e88e6c6ac7f")
    public void setHwMemory_AssociationEnd_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c11ba9dc-5554-4b68-95c3-b8222fe0fcb9")
    public void setHwMemory_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9350a78-9a2a-4e55-ae69-ec9da7196187")
    public void setHwMemory_AssociationEnd_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8bdd2de8-929f-4b1b-8a60-1e477781cc21")
    public void setHwMemory_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("adccec66-1d62-4b8b-9bba-9e6da900ed86")
    public void setHwMemory_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("922fc1c6-183f-4a7f-ad10-05103acbbb80")
    public void setHwMemory_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df5eb9d6-3979-4a59-84de-b3ec563f5fec")
    public void setHwMemory_AssociationEnd_throughput(final String value) {
        this.elt.putTagValue(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_AssociationEnd_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2da132fb-7ab1-415c-8975-d50ab1fbc7a1")
    public void setHwMemory_AssociationEnd_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryAssociationEnd.MdaTypes.HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("c94c69ff-f1e0-4a9d-ace5-097f6c74122f")
    protected HwMemoryAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("6853cc45-ca74-44af-8523-0d5e5b1f8246")
    public static final class MdaTypes {
        @objid ("ab9c0d6a-6efc-4e2c-8350-8749721cc42d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67d87136-67fa-4dcc-af48-a1f5100e88fa")
        public static TagType HWMEMORY_ASSOCIATIONEND_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("c4a173c7-bac7-4068-bc28-c31bfeebfe1e")
        public static TagType HWMEMORY_ASSOCIATIONEND_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("d2cee816-88c6-4788-a238-338e87a6fe84")
        public static TagType HWMEMORY_ASSOCIATIONEND_TIMINGS_TAGTYPE_ELT;

        @objid ("66c70c1d-1b86-43c0-92d7-6d1a477cd1b1")
        public static TagType HWMEMORY_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        @objid ("940bf53d-90da-4702-b037-0683fb9339c6")
        public static TagType HWMEMORY_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("fefd510b-a069-4e1b-9cd8-809644cabc3a")
        public static TagType HWMEMORY_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4da1c6cf-30db-453f-8771-911308368af3")
        public static TagType HWMEMORY_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3767f4de-19ce-44b2-8f50-5383c947f49f")
        public static TagType HWMEMORY_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("10eb17d2-03cf-4c69-8d73-09afc3f851ab")
        public static TagType HWMEMORY_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("7d985431-7151-4945-845b-0c2bf1fb3c07")
        public static TagType HWMEMORY_ASSOCIATIONEND_ENDPOINTS_TAGTYPE_ELT;

        @objid ("0166c6ef-f1ae-47e9-b7a9-50c530c3c779")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7ba62c5-7f8b-495f-985e-f55400707c98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef5d51ed-e1d3-4e32-929a-3a82301a7eb7")
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
