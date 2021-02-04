/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("1d2c9a44-2aaf-4ed8-bdbe-08eb98e25df5")
    public static final String STEREOTYPE_NAME = "MemoryBroker_Classifier";

    @objid ("b6b08dc8-34f7-491a-93af-c107dc877c08")
    public static final String MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Classifier_accessPolicy";

    @objid ("1e65d021-c4bf-4811-ba6e-0330aee4ea42")
    public static final String MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_lockServices";

    @objid ("5fbf7b7b-1846-4c1b-bb2a-e6d37f7dd74e")
    public static final String MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_mapServices";

    @objid ("91cda025-b839-4448-88e5-ba913441dd4d")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE = "MemoryBroker_Classifier_memories";

    @objid ("f9542165-de0c-4b33-8177-001756e400b9")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockAdressElements";

    @objid ("b5f8adac-855f-48ef-ae0e-eee42d9e0e10")
    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockSizeElements";

    @objid ("093c4be1-a04b-4468-ab09-a945c54178c4")
    public static final String MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_unMapServices";

    @objid ("76599baf-feb2-4b44-8bf0-fb5846bec469")
    public static final String MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryBroker_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("175bcd12-7bb5-4d69-87b5-90b3fca7eadb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryBroker_Classifier >> then instantiate a {@link MemoryBrokerClassifier} proxy.
     * 
     * @return a {@link MemoryBrokerClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("a2b06baf-78db-4804-aca6-3b4297d40aa4")
    public static MemoryBrokerClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerClassifier.STEREOTYPE_NAME);
        return MemoryBrokerClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MemoryBrokerClassifier} proxy from a {@link Classifier} stereotyped << MemoryBroker_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MemoryBrokerClassifier} proxy or <i>null</i>.
     */
    @objid ("3967b5a7-7d2e-4cc8-9c9f-b9bfe9e0f3d1")
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
    @objid ("316a2c2a-c0f2-424b-af34-6371cd4ed6b1")
    public static MemoryBrokerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryBrokerClassifier.canInstantiate(obj))
        	return new MemoryBrokerClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f226c8f-70ce-4ce9-a911-11a8766587ea")
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
    @objid ("e9d60304-b755-423d-a66c-15bab22a73b3")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d23f283-1d48-44ef-917f-27de72e4a951")
    public String getMemoryBroker_Classifier_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9afd9436-b1bb-45ab-9648-11c0c4a13be8")
    public List<String> getMemoryBroker_Classifier_lockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3c616b47-b129-4546-b90a-2db8b3d6f13e")
    public List<String> getMemoryBroker_Classifier_mapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("22aed4a9-821f-4131-97f5-b5cc485337d8")
    public List<String> getMemoryBroker_Classifier_memories() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b42fc1fb-5a42-479c-8243-b69226fe1894")
    public List<String> getMemoryBroker_Classifier_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c0d36f45-0e84-4d9b-8843-66c663626ed1")
    public List<String> getMemoryBroker_Classifier_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28d5cff7-f0d3-4e88-ab26-956f0aee05f7")
    public List<String> getMemoryBroker_Classifier_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("adfc2639-66d0-44e0-8950-cca1cac803ac")
    public List<String> getMemoryBroker_Classifier_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @objid ("123ce37a-22be-4e3e-bb68-e3be0db19971")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae3c3ca2-e983-4596-918a-06bdaa1e20d3")
    public void setMemoryBroker_Classifier_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eeb36a09-7739-48f9-a1bc-fdc86f68d308")
    public void setMemoryBroker_Classifier_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0b9b178-b446-42c0-8d02-2ef266e79d8b")
    public void setMemoryBroker_Classifier_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21df7082-81f6-4658-b286-d80273f4dfd1")
    public void setMemoryBroker_Classifier_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("14f41cce-25f2-4ea9-a0b2-29e695feebb6")
    public void setMemoryBroker_Classifier_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfdf8cd6-3fc7-4be5-84f2-3d24c9dd7851")
    public void setMemoryBroker_Classifier_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79449983-fbb2-4c07-814c-207dd1610150")
    public void setMemoryBroker_Classifier_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e1d9c82-5a83-4dcd-8049-95c1dec85f5d")
    public void setMemoryBroker_Classifier_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    @objid ("4b646983-b3ac-4ff1-b08c-01a643d30487")
    protected MemoryBrokerClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3f39a626-6dee-425f-98de-165c49a379bf")
    public static final class MdaTypes {
        @objid ("787e015a-da5a-455d-864a-edad9aebfe25")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f6d49d6-aca7-4071-9d2f-b0b2700c74cf")
        public static TagType MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT;

        @objid ("dc848832-d7fb-47d9-b373-938db958c4c0")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT;

        @objid ("de3ed4c3-dd08-45ec-b40d-e68b4239c899")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        @objid ("90ebe580-bbd6-485f-aab4-c7e497d4db53")
        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        @objid ("84db5d8e-d2b9-4186-a0fc-2cab17567bce")
        public static TagType MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT;

        @objid ("aadbbcce-149f-4489-a965-fc9f7606180e")
        public static TagType MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT;

        @objid ("ec7d1a82-2666-4310-b46e-104534522192")
        public static TagType MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT;

        @objid ("b062f0f1-8cce-4803-8d0d-92ed9e3c96a3")
        public static TagType MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT;

        @objid ("3000ea21-feb0-410d-bd08-add9ca6f1a37")
        private static Stereotype MDAASSOCDEP;

        @objid ("eecd68d8-64ff-41f0-a64f-91028f25cc04")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d19512bc-6b3e-4df0-a70a-ed7336515f52")
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
