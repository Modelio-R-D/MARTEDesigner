/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("92ec7cb9-2caa-4f9c-8242-ff8a7d934062")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Classifier";

    @objid ("cb43b5a3-7938-4ef9-a85e-d702a7d0de17")
    public static final String MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_NameSpace_concurrentResources";

    @objid ("ab466b19-6931-4ca9-be71-15c5c41ac2e3")
    public static final String MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE = "MemoryPartition_NameSpace_exit";

    @objid ("14004fb8-7977-429e-b39f-9e3a793f3b42")
    public static final String MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE = "MemoryPartition_NameSpace_fork";

    @objid ("35d0377f-cff2-4cfc-91e9-b40a8733daba")
    public static final String MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE = "MemoryPartition_NameSpace_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << MemoryPartition_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ab53fae6-8197-414b-adfa-cc929345b383")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << MemoryPartition_Classifier >> then instantiate a {@link MemoryPartitionClassifier} proxy.
     * 
     * @return a {@link MemoryPartitionClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("ea7b1195-70df-473b-8603-2d9751c21bab")
    public static MemoryPartitionClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionClassifier.STEREOTYPE_NAME);
        return MemoryPartitionClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionClassifier} proxy from a {@link Classifier} stereotyped << MemoryPartition_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link MemoryPartitionClassifier} proxy or <i>null</i>.
     */
    @objid ("ebada5ab-5406-4b37-81a5-e1c99b8e898e")
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
    @objid ("5e7ee243-0980-43a8-a912-2e4d6975234e")
    public static MemoryPartitionClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (MemoryPartitionClassifier.canInstantiate(obj))
        	return new MemoryPartitionClassifier(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d5ccd425-3803-47ff-962d-65d953781956")
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
    @objid ("2e51816d-d2a2-47db-9baa-5e97fa332825")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3bae88e-228b-458d-b182-70b96bb6240c")
    public List<String> getMemoryPartition_NameSpace_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5c93d6cc-ecd2-47c9-ae71-5304e184b9f8")
    public List<String> getMemoryPartition_NameSpace_exit() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("07dae233-d38c-4009-a9fc-7923fbbb408a")
    public List<String> getMemoryPartition_NameSpace_fork() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e3be1982-509b-4e78-a62b-54c37c4a0fac")
    public List<String> getMemoryPartition_NameSpace_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("fc73878f-15fb-4039-b63d-4676ed278fac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("817b4d96-5730-4dd1-82e8-b3f3b820144c")
    public void setMemoryPartition_NameSpace_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9666dac-8e1f-45ee-b742-6ec467d55a22")
    public void setMemoryPartition_NameSpace_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb7c4ea6-9541-4dc2-8477-40d51100ef1b")
    public void setMemoryPartition_NameSpace_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_NameSpace_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8226432-b640-4d74-b1ea-09815502439b")
    public void setMemoryPartition_NameSpace_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionClassifier.MdaTypes.MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("6c5cfb8c-8efa-468c-8cae-5bf9993662bb")
    protected MemoryPartitionClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f70d4742-51a6-4bac-9d9a-c9deb90f2b87")
    public static final class MdaTypes {
        @objid ("16f30dea-70de-4ca2-92e7-ba8f42347ec9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d940f74-f13d-4edd-ada3-c7806e519f18")
        public static TagType MEMORYPARTITION_NAMESPACE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("209395b8-e523-4618-93b8-60b67da5e0e8")
        public static TagType MEMORYPARTITION_NAMESPACE_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("1a92904d-ac28-49e7-8c44-12111752aef9")
        public static TagType MEMORYPARTITION_NAMESPACE_FORK_TAGTYPE_ELT;

        @objid ("9bc7795f-3d20-4970-8f4a-5249caa96d3d")
        public static TagType MEMORYPARTITION_NAMESPACE_EXIT_TAGTYPE_ELT;

        @objid ("5eec5733-0067-43db-bb00-f9658aca1f61")
        private static Stereotype MDAASSOCDEP;

        @objid ("20e92eee-77c8-4a47-a808-c8bf2cbded44")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ceaaf2f5-1b26-4091-8057-3f2770c1c228")
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
