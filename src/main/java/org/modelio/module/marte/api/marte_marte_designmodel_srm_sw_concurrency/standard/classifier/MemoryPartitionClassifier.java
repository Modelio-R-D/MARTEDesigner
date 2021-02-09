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
public class MemoryPartitionClassifier extends SwResourceClassifier {
    public static final String STEREOTYPE_NAME = "MemoryPartition_Classifier";

    public static final String MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_NameSpace_concurrentResources";

    public static final String MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE = "MemoryPartition_NameSpace_exit";

    public static final String MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE = "MemoryPartition_NameSpace_fork";

    public static final String MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE = "MemoryPartition_NameSpace_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryPartition_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryPartition_Classifier >> then instantiate a {@link MemoryPartitionClassifier} proxy.
     * 
     * @return a {@link MemoryPartitionClassifier} proxy on the created {@link Classifier}.
     */
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
    public static MemoryPartitionClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryPartitionClassifier.canInstantiate(obj))
        	return new MemoryPartitionClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MemoryPartitionClassifier other = (MemoryPartitionClassifier) obj;
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
     * Getter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_NameSpace_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_NameSpace_exit() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_NameSpace_fork() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getMemoryPartition_NameSpace_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_NameSpace_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_NameSpace_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_NameSpace_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setMemoryPartition_NameSpace_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    protected MemoryPartitionClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT;

        public static TagType MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
