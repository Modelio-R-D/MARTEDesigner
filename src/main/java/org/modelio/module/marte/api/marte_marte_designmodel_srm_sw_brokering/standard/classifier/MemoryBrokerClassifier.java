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
public class MemoryBrokerClassifier extends SwResourceClassifier {
    public static final String STEREOTYPE_NAME = "MemoryBroker_Classifier";

    public static final String MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE = "MemoryBroker_Classifier_accessPolicy";

    public static final String MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_lockServices";

    public static final String MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_mapServices";

    public static final String MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE = "MemoryBroker_Classifier_memories";

    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockAdressElements";

    public static final String MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE = "MemoryBroker_Classifier_memoryBlockSizeElements";

    public static final String MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE = "MemoryBroker_Classifier_unMapServices";

    public static final String MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE = "MemoryBroker_Classifier_unlockServices";

    /**
     * Tells whether a {@link MemoryBrokerClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryBroker_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryBrokerClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryBroker_Classifier >> then instantiate a {@link MemoryBrokerClassifier} proxy.
     * 
     * @return a {@link MemoryBrokerClassifier} proxy on the created {@link Classifier}.
     */
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
    public static MemoryBrokerClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryBrokerClassifier.canInstantiate(obj))
        	return new MemoryBrokerClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryBrokerClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryBrokerClassifier other = (MemoryBrokerClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getMemoryBroker_Classifier_accessPolicy() {
        return this.elt.getTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_lockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_mapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_memories() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_memoryBlockAdressElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_memoryBlockSizeElements() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_unMapServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryBroker_Classifier_unlockServices() {
        return this.elt.getTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'MemoryBroker_Classifier_accessPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_accessPolicy(final String value) {
        this.elt.putTagValue(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_lockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_lockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_mapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_mapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_memories(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockAdressElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_memoryBlockAdressElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_memoryBlockSizeElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_memoryBlockSizeElements(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unMapServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_unMapServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryBroker_Classifier_unlockServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryBroker_Classifier_unlockServices(final List<String> values) {
        this.elt.putTagValues(MemoryBrokerClassifier.MdaTypes.MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT, values);
    }

    protected MemoryBrokerClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_ACCESSPOLICY_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_MEMORIES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKADRESSELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_MEMORYBLOCKSIZEELEMENTS_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_LOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_UNLOCKSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_MAPSERVICES_TAGTYPE_ELT;

        public static TagType MEMORYBROKER_CLASSIFIER_UNMAPSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
