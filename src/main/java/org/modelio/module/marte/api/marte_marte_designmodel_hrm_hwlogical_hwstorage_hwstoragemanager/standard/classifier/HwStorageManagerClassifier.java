/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << HwStorageManager_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6f9eab62-315f-4dde-8584-a12ec0880539")
public class HwStorageManagerClassifier extends StorageResourceClassifier {
    @objid ("57e1777c-dde8-41b8-877b-9ac80bc66195")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Classifier";

    @objid ("21f5f027-5e2d-41df-b0d1-34b0c616b4c9")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwStorageManager_Classifier_description";

    @objid ("5cb1c8da-aa0a-433c-8990-389b8a607d0d")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwStorageManager_Classifier_endPoints";

    @objid ("43467ca6-a67e-4992-9e5f-235bb1a463de")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY_TAGTYPE = "HwStorageManager_Classifier_frequency";

    @objid ("3bfeed4d-e064-4425-9c13-44edf647eddb")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Classifier_managedMemories";

    @objid ("ea0d0692-b819-419a-a75a-2c7de3c27013")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW_TAGTYPE = "HwStorageManager_Classifier_ownedHW";

    @objid ("510637db-4532-4c66-a7cf-ee095eee1d94")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Classifier_p_HW_Services";

    @objid ("740280a5-9412-4771-acaf-c3054b9869da")
    public static final String HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwStorageManager_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("88ad66a2-c2a8-478b-9676-885a553f178e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwStorageManager_Classifier >> then instantiate a {@link HwStorageManagerClassifier} proxy.
     * 
     * @return a {@link HwStorageManagerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("d6eb2e17-5720-4107-b36f-74bf4af9c80b")
    public static HwStorageManagerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerClassifier.STEREOTYPE_NAME);
        return HwStorageManagerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerClassifier} proxy from a {@link Classifier} stereotyped << HwStorageManager_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwStorageManagerClassifier} proxy or <i>null</i>.
     */
    @objid ("765ec0eb-2609-4c3a-98d2-ae3d646ab115")
    public static HwStorageManagerClassifier instantiate(final Classifier obj) {
        return HwStorageManagerClassifier.canInstantiate(obj) ? new HwStorageManagerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerClassifier} proxy from a {@link Classifier} stereotyped << HwStorageManager_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwStorageManagerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dd4e29b9-e83c-4f7d-a4e3-4f0c00e044e3")
    public static HwStorageManagerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwStorageManagerClassifier.canInstantiate(obj))
        	return new HwStorageManagerClassifier(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aec02169-825d-4fa9-a7d6-410d4bac9488")
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
        HwStorageManagerClassifier other = (HwStorageManagerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("25b29c17-8d34-4f2c-98a9-8f19a0b570c0")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01d0f1e5-ae97-4c0b-9f16-018c324a23dc")
    public String getHwStorageManager_Classifier_description() {
        return this.elt.getTagValue(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c34b2cf4-2c8a-444e-a220-232b5d668aa0")
    public List<String> getHwStorageManager_Classifier_endPoints() {
        return this.elt.getTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40fe706e-6d6c-4c36-8ce6-238f54b20f7c")
    public String getHwStorageManager_Classifier_frequency() {
        return this.elt.getTagValue(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Classifier_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23b540f3-ea6f-436f-bed2-b0360d434159")
    public List<String> getHwStorageManager_Classifier_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2af56d93-6e75-4301-8053-9c05a2880026")
    public List<String> getHwStorageManager_Classifier_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53369373-c781-4b80-8fd2-fe176efe2cbc")
    public List<String> getHwStorageManager_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d7749dab-e114-4a1d-a77a-58127dcd69d2")
    public List<String> getHwStorageManager_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("24baa0fc-788f-414b-b04e-7148e8de00c9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6cffd7ff-17e2-45ad-bbe8-74126c42f9b3")
    public void setHwStorageManager_Classifier_description(final String value) {
        this.elt.putTagValue(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54a62261-d365-435c-bdba-a50b7bf42cfa")
    public void setHwStorageManager_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b58c9973-ac75-4d98-a7dc-d78ba5d953d3")
    public void setHwStorageManager_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Classifier_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b1f8cea-8408-4e8f-8398-16cd87aa4a1f")
    public void setHwStorageManager_Classifier_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("856f8752-b0b7-4749-9d16-b9ddde3c6d5c")
    public void setHwStorageManager_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf3aaead-d6c5-4d3d-bdba-0ff16f5f8b2a")
    public void setHwStorageManager_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47f83b82-bade-4153-b793-15da3d8e4531")
    public void setHwStorageManager_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerClassifier.MdaTypes.HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("9e17428b-c745-4201-806f-2c72cfef17fd")
    protected HwStorageManagerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("0f13ac4b-58cd-473f-bbf3-7d99bbe3ae65")
    public static final class MdaTypes {
        @objid ("6278b760-a9be-49bb-b72b-f9cd25858a18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("766b8bee-c91d-4635-83cd-108bb03488e4")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("aa7026ba-aa25-4e73-9b9b-d018d8fd72e1")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("a72407fa-9212-4385-8208-61cbae0be92c")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3a1063e6-d11c-4a2a-9dbf-4b83e65746ee")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("ddec2f97-e3ed-41fa-98af-1eb92768655a")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("8a88abed-3f5a-4865-a02f-8b3504f8a6f2")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("2891cf52-e66a-41ed-8f76-6c26cc3bbfc0")
        public static TagType HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("af01228b-b1c3-4326-bd30-75a604df6b30")
        private static Stereotype MDAASSOCDEP;

        @objid ("3cb3ae99-b6ea-4215-b412-c53e8cbdb74f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dcc23a97-c6bd-44a4-95c4-e0384184e6c9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1f9057ae-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f9057af-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b77793a0-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b77793a1-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b77793a2-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b77793a3-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b77793a4-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4beab471-1710-11df-b92a-0014222a9f79");
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
