/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << MemoryPartition_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4a0344b0-047f-49f1-8268-332d3dd7a22a")
public class MemoryPartitionClassifier extends SwResourceClassifier {
    @objid ("6f570b07-7e7d-4911-b137-cefb121e27ac")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Classifier";

    @objid ("45d23817-4439-47dc-8659-5f7ee4bb3c38")
    public static final String MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_NameSpace_concurrentResources";

    @objid ("c590c3e7-036e-4788-a231-bc9978ee327a")
    public static final String MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE = "MemoryPartition_NameSpace_exit";

    @objid ("2fa939d6-5ce7-490f-9f32-e3e49b3dbb98")
    public static final String MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE = "MemoryPartition_NameSpace_fork";

    @objid ("fa83bd5b-4b59-46b6-9551-e1d97385d747")
    public static final String MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE = "MemoryPartition_NameSpace_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryPartition_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("48c7e6fd-1258-4b07-a1c6-15af3850f282")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryPartition_Classifier >> then instantiate a {@link MemoryPartitionClassifier} proxy.
     * 
     * @return a {@link MemoryPartitionClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("90f51c69-6e78-4744-b9f3-6ffffca17850")
    public static MemoryPartitionClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionClassifier.STEREOTYPE_NAME);
        return MemoryPartitionClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionClassifier} proxy from a {@link Classifier} stereotyped << MemoryPartition_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MemoryPartitionClassifier} proxy or <i>null</i>.
     */
    @objid ("7474151a-f82a-45a0-8864-5c3f5695d200")
    public static MemoryPartitionClassifier instantiate(final Classifier obj) {
        return MemoryPartitionClassifier.canInstantiate(obj) ? new MemoryPartitionClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionClassifier} proxy from a {@link Classifier} stereotyped << MemoryPartition_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link MemoryPartitionClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("50fe8e61-8140-410b-85c5-d48004f4753f")
    public static MemoryPartitionClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryPartitionClassifier.canInstantiate(obj))
        	return new MemoryPartitionClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("37d5c31a-35e3-422c-a7bb-4985d0cbfb92")
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
        MemoryPartitionClassifier other = (MemoryPartitionClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("b1db1208-ab32-4de3-9aeb-03d379bb36e1")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("af12912c-da6f-4c8a-b460-7643e783a02f")
    public List<String> getMemoryPartition_NameSpace_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c3c21dd5-0cf1-464e-8cdd-670ea4a3e4ce")
    public List<String> getMemoryPartition_NameSpace_exit() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("97018964-71c5-4bfc-a0bf-ac9581a200a0")
    public List<String> getMemoryPartition_NameSpace_fork() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9c9b8bf7-336b-4411-aeb2-c67dfaada250")
    public List<String> getMemoryPartition_NameSpace_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("c7ec690f-31b6-416c-86f0-7d7eb23e2249")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("19f98fe1-31ca-4b16-8a8f-a2c86264c82c")
    public void setMemoryPartition_NameSpace_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("581b5b7a-d856-47b4-a471-3a28234f8b54")
    public void setMemoryPartition_NameSpace_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbe76044-ade1-44b8-8981-88fbf760cbc0")
    public void setMemoryPartition_NameSpace_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9af22d5e-6217-4032-bb4b-ee66a24abcb6")
    public void setMemoryPartition_NameSpace_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("fac55426-58af-485a-ae02-e9a46f2bb4b2")
    protected MemoryPartitionClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f70d4742-51a6-4bac-9d9a-c9deb90f2b87")
    public static final class MdaTypes {
        @objid ("b1108e47-316d-4ac7-aa8e-a7aae0ceac92")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25d84f35-36e2-4f5a-bdb1-993a4ab61b8f")
        public static TagType MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("0ef10bfb-2abf-421d-a607-a76d22d744ce")
        public static TagType MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("6b64f736-64ed-4e0b-8cc7-fd49eeb0229c")
        public static TagType MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT;

        @objid ("e44a181f-4f80-4c4b-ae56-3762719fae8d")
        public static TagType MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT;

        @objid ("dfa08632-ba79-44d8-9136-2c8ece846c9b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a8680bd5-b768-4318-b4b9-62bc7b1c9137")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("85e5c439-a6b0-4b40-a7bf-3daa13e03205")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f915dc02-10cf-11df-81d9-0014222a9f79");
            MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b3e23e5-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b3e23e6-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b3e23e7-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1b3e23e8-172b-11df-b92a-0014222a9f79");
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
