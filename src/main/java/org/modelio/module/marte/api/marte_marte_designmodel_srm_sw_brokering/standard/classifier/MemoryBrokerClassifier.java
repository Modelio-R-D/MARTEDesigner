/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_brokering.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << MemoryBroker_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5852f61b-ade2-4bed-be6c-3f87f8be7e0d")
public class MemoryBrokerClassifier extends SwResourceClassifier {
    @objid ("97900778-168b-4827-98fb-ac36567f653b")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Classifier";

    @objid ("3eb5956f-eba9-4686-a286-519597595afc")
    public static final String MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Classifier_accessPolicy";

    @objid ("f80dfac1-d084-42e5-b51a-0cce38c1c087")
    public static final String MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_lockServices";

    @objid ("b9621e43-9c15-449b-a992-6ceaf49356cb")
    public static final String MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_mapServices";

    @objid ("425cf72b-bb16-4efb-8783-fae63670e6ee")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE = "MemoryBroker_Classifier_memories";

    @objid ("a8f8c1dd-11cb-4925-add0-05576277dd9c")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockAdressElements";

    @objid ("0a7b1489-fae7-4359-89b9-e4e945dbc122")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockSizeElements";

    @objid ("646299d1-d80a-4039-9daa-17384a559e05")
    public static final String MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_unMapServices";

    @objid ("41794725-cc18-4843-8132-aadedb1c1d2f")
    public static final String MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryBroker_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("41e6c5b8-7a07-47b8-97c4-c73012cd3973")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryBroker_Classifier >> then instantiate a {@link MemoryBrokerClassifier} proxy.
     * 
     * @return a {@link MemoryBrokerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("bc03d1bc-4ab7-4f1d-8303-46b2d42f0b92")
    public static MemoryBrokerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerClassifier.STEREOTYPE_NAME);
        return MemoryBrokerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerClassifier} proxy from a {@link Classifier} stereotyped << MemoryBroker_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MemoryBrokerClassifier} proxy or <i>null</i>.
     */
    @objid ("26b367ce-351b-43b1-a5dd-f4c962462157")
    public static MemoryBrokerClassifier instantiate(final Classifier obj) {
        return MemoryBrokerClassifier.canInstantiate(obj) ? new MemoryBrokerClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerClassifier} proxy from a {@link Classifier} stereotyped << MemoryBroker_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link MemoryBrokerClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cba13289-5b43-481e-ba23-300afaa03ac5")
    public static MemoryBrokerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryBrokerClassifier.canInstantiate(obj))
        	return new MemoryBrokerClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de92aeb0-1d44-4b6b-af64-42632d547784")
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
        MemoryBrokerClassifier other = (MemoryBrokerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("61f2d7d0-0397-4ff0-9d4c-32f89c7b2110")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("618ef81b-222e-40f3-852d-693f29d1122f")
    public String getMemoryBroker_Classifier_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("895630d2-6542-43a8-ab11-124ddc7aa7f3")
    public List<String> getMemoryBroker_Classifier_lockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c6007c87-39f8-46d7-a8a1-3ad8d6eb8e93")
    public List<String> getMemoryBroker_Classifier_mapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6c97d919-6fc0-451a-8cfb-fb887511b9c1")
    public List<String> getMemoryBroker_Classifier_memories() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("411f81c8-846e-4521-89db-4953b38b2891")
    public List<String> getMemoryBroker_Classifier_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("abec6fe4-454a-4dfe-a74d-ac06bd50e414")
    public List<String> getMemoryBroker_Classifier_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dd453cda-2f01-476b-9530-2bba6ce5bd15")
    public List<String> getMemoryBroker_Classifier_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("be96bb4a-db9d-44f3-92e2-b8fd2e469f8e")
    public List<String> getMemoryBroker_Classifier_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("1aa9f05d-9294-4c2a-9afd-f61bcb32b086")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("609b140f-f4ab-4d24-a309-4275e1fd8210")
    public void setMemoryBroker_Classifier_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb1c6314-686a-4495-9f11-9b881df48934")
    public void setMemoryBroker_Classifier_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f277abe-fa00-4f42-8c13-ab6dac371764")
    public void setMemoryBroker_Classifier_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f34b16e9-047c-4a55-95b8-02d67094837d")
    public void setMemoryBroker_Classifier_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d629d834-b3be-4c05-8ed2-db45dae2572f")
    public void setMemoryBroker_Classifier_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42919ab0-1b56-41c2-964f-62ee6271adf7")
    public void setMemoryBroker_Classifier_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26634c0d-b56d-4e5d-9be0-48788921ed78")
    public void setMemoryBroker_Classifier_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5006a67e-baf9-4fcf-a405-41ed8f7f223e")
    public void setMemoryBroker_Classifier_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("51fdaf71-0803-4550-95be-22b95dcbf2ee")
    protected MemoryBrokerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3f39a626-6dee-425f-98de-165c49a379bf")
    public static final class MdaTypes {
        @objid ("416e4164-3984-41ac-98d3-7a31af9dffde")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf0302e0-6af3-43f6-b87b-235700c7a2b1")
        public static TagType MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("f448ddc0-1d90-4bc8-9a50-9a86a091bb3a")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT;

        @objid ("3ced0cf0-71dd-4cef-9e9d-bba0b33ab417")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("4fb266f8-163b-4442-91ec-46393a75dc08")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("cafda2a2-776d-473f-bcff-d151458ea8d6")
        public static TagType MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("10eb9a47-b03f-4451-879a-9f1ae34fbb75")
        public static TagType MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("2e44a3f8-47dc-443e-be4b-10849a18cae4")
        public static TagType MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT;

        @objid ("0c5f5e47-35fa-4db7-8bfc-8a88361523b2")
        public static TagType MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("387259b0-dcb0-49de-81d0-3edea9ac6337")
        private static Stereotype MDAASSOCDEP;

        @objid ("91b35f18-f14f-4a7e-8db4-ca738d10e837")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b80bfa7b-c434-4692-81b2-7a8304f808ae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4b5d4a9f-10d2-11df-81d9-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9e0-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9df-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9de-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9dd-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9dc-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9db-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9da-172e-11df-b92a-0014222a9f79");
            MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b6fc9d9-172e-11df-b92a-0014222a9f79");
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
