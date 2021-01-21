/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.StorageResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwMemory_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3b9996b0-6c22-494d-b793-a9ee4c467ef3")
public class HwMemoryClassifier extends StorageResourceClassifier {
    @objid ("ff2b3f24-e6c8-42df-95c0-1817d85d46f7")
    public static final String STEREOTYPE_NAME = "HwMemory_Classifier";

    @objid ("7fbe4c45-68c9-4b6f-a8c8-8ce09e694f80")
    public static final String HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE = "HwMemory_Classifier_adressSize";

    @objid ("a68202c2-5bdf-45d2-9287-fbe0d264752d")
    public static final String HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwMemory_Classifier_description";

    @objid ("c844a122-633f-4a13-bb21-62ec9b95826e")
    public static final String HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwMemory_Classifier_endPoints";

    @objid ("99144ec2-6606-4ad2-a159-8f81d631b87f")
    public static final String HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE = "HwMemory_Classifier_frequency";

    @objid ("58a9e10e-8db2-4e64-b57e-02cd711704c4")
    public static final String HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE = "HwMemory_Classifier_memorySize";

    @objid ("9f6e8e8c-34c7-43a6-a6c2-84f1ba40156d")
    public static final String HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE = "HwMemory_Classifier_ownedHW";

    @objid ("120d2e01-e839-4c5a-8639-e8312109a2f2")
    public static final String HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwMemory_Classifier_p_HW_Services";

    @objid ("0be414aa-8313-41ba-a924-33d14a98a586")
    public static final String HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwMemory_Classifier_r_HW_Services";

    @objid ("a3a2fe85-4627-49a9-8085-43f1dab4847a")
    public static final String HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE = "HwMemory_Classifier_throughput";

    @objid ("86bc6044-6d42-491f-b95e-6dc855efa975")
    public static final String HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE = "HwMemory_Classifier_timings";

    /**
     * Tells whether a {@link HwMemoryClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwMemory_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("731f2cdd-2ca5-4a46-b823-858cfd3282d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwMemory_Classifier >> then instantiate a {@link HwMemoryClassifier} proxy.
     * 
     * @return a {@link HwMemoryClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("877dfacb-5a79-4559-82f9-78153e4ce6b2")
    public static HwMemoryClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMemoryClassifier.STEREOTYPE_NAME);
        return HwMemoryClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwMemoryClassifier} proxy from a {@link Classifier} stereotyped << HwMemory_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwMemoryClassifier} proxy or <i>null</i>.
     */
    @objid ("54f2201b-49d0-4ac5-ac3d-e8e0bbf8e5fd")
    public static HwMemoryClassifier instantiate(final Classifier obj) {
        return HwMemoryClassifier.canInstantiate(obj) ? new HwMemoryClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMemoryClassifier} proxy from a {@link Classifier} stereotyped << HwMemory_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwMemoryClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("944b4ab0-2ede-4b82-92ce-978b91b7cf6a")
    public static HwMemoryClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwMemoryClassifier.canInstantiate(obj))
        	return new HwMemoryClassifier(obj);
        else
        	throw new IllegalArgumentException("HwMemoryClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1361469d-7afd-4310-a6d3-af726c73bb4f")
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
        HwMemoryClassifier other = (HwMemoryClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("4ad2c571-27be-49f3-9c9e-1685c1d97578")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwMemory_Classifier_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76e4311d-a672-43ba-b2de-021ce27dbbe0")
    public String getHwMemory_Classifier_adressSize() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("480e5849-fc99-4a34-9f62-f02986f8dbdc")
    public String getHwMemory_Classifier_description() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05e7de31-4811-4cc9-8ff8-d7eb628cb2f6")
    public List<String> getHwMemory_Classifier_endPoints() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("140202e0-1c6e-460e-a053-53dd4e95a0c1")
    public String getHwMemory_Classifier_frequency() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17da10af-52cb-4abc-8ce1-6fdeccb8d9c7")
    public String getHwMemory_Classifier_memorySize() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0a7091a6-c51c-48d3-a6bb-04ae206b8853")
    public List<String> getHwMemory_Classifier_ownedHW() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c7925e1d-a7dd-4ebc-aa81-128795fb5aff")
    public List<String> getHwMemory_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cdb83207-0079-4485-bd29-cd42a3ad378f")
    public List<String> getHwMemory_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMemory_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a568ce4-e005-4b14-9a13-2be2f36b4fad")
    public String getHwMemory_Classifier_throughput() {
        return this.elt.getTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwMemory_Classifier_timings'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e4815e0a-1b9d-4ec8-b29f-3728736c074e")
    public List<String> getHwMemory_Classifier_timings() {
        return this.elt.getTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT);
    }

    @objid ("f71b91a2-ca65-4c48-9753-f31a9d2ee815")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwMemory_Classifier_adressSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89a5fe8f-4f82-4e66-a864-22b0de55ca13")
    public void setHwMemory_Classifier_adressSize(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("723607b6-b698-4fbe-bf56-36667a40f03d")
    public void setHwMemory_Classifier_description(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e90b3ec5-def0-4d03-9ec3-543a79f60558")
    public void setHwMemory_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0aae793-4eb1-484d-99ab-3e38104d2280")
    public void setHwMemory_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e30a47f1-2aa8-4944-a0c9-182fede6c8c4")
    public void setHwMemory_Classifier_memorySize(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a7cd7804-e6c5-4d65-ae49-0f7de05ffaeb")
    public void setHwMemory_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("765b1d6f-1db7-4008-a34f-54755e3d63dc")
    public void setHwMemory_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8121cbbc-cddc-4db8-9a26-44a914d4d3a5")
    public void setHwMemory_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMemory_Classifier_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("43f03579-92cf-490c-bf03-0ad1c2ff0961")
    public void setHwMemory_Classifier_throughput(final String value) {
        this.elt.putTagValue(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwMemory_Classifier_timings'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dcba9c11-b32b-4173-b702-aca5b806d210")
    public void setHwMemory_Classifier_timings(final List<String> values) {
        this.elt.putTagValues(HwMemoryClassifier.MdaTypes.HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT, values);
    }

    @objid ("18deeafd-ee57-4f72-9dde-a87cfcb7d847")
    protected HwMemoryClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("cb3223c7-8f7c-4d85-beed-f79823e2cfdb")
    public static final class MdaTypes {
        @objid ("e811c282-eb8f-403d-b445-bb633baef1f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d78ef37-427d-4cc8-b12d-d35e83ea9151")
        public static TagType HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("fcc14aa1-1ec4-4396-b6ca-95032353ca00")
        public static TagType HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT;

        @objid ("b5ad8eba-a996-4d88-9e92-595ad3696d4e")
        public static TagType HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT;

        @objid ("ab761c3d-e00a-4fcd-bca4-98d05bb7c835")
        public static TagType HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("eadcb923-d27c-42cc-8e76-b32a2cdf94de")
        public static TagType HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("bb27d812-801a-455a-ae36-857eed57f515")
        public static TagType HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8c125c4e-d68f-4a1d-87a2-274b8fdc8b3e")
        public static TagType HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("df4f6431-1b7f-40e2-9c5f-0e09de9d97eb")
        public static TagType HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("02bdfafd-816a-4816-9d4e-2f4a4325ddbf")
        public static TagType HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("10009661-7c70-4cf5-aa8e-72444912740d")
        public static TagType HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("bd64a905-378c-4423-bdf7-e681aae80195")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a623224-8378-4480-adff-02c8333fecf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0dd09312-6ca0-43da-86b1-d30605ab28fe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f46f5a27-1004-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff78-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_ADRESSSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff79-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_TIMINGS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff7a-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "065cff7b-1005-11df-86fe-0014222a9f79");
            HWMEMORY_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef6-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef7-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef8-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15ef9-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b7c15efa-162d-11df-b9be-0014222a9f79");
            HWMEMORY_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bdaba29-170f-11df-b92a-0014222a9f79");
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
