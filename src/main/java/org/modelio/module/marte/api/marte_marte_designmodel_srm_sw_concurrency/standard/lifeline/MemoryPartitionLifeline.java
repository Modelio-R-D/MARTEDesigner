/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << MemoryPartition_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("03d95e49-1c76-4ef9-b624-1dcf2fb37e33")
public class MemoryPartitionLifeline extends SwResourceLifeline {
    @objid ("96fe5fa4-cd6a-4768-aa67-f590fe6bbe19")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Lifeline";

    @objid ("63ebd05b-1f8e-4baf-94cb-4d107bb705fb")
    public static final String MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Lifeline_concurrentResources";

    @objid ("fd8d71f2-5d36-4326-89a8-a5448dc6efec")
    public static final String MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE = "MemoryPartition_Lifeline_exit";

    @objid ("a3e24cf8-8280-459e-843c-df5399c91cf3")
    public static final String MEMORYPARTITION_LIFELINE_FORK_TAGTYPE = "MemoryPartition_Lifeline_fork";

    @objid ("56c08ef1-6743-4760-9f51-d643559eeafb")
    public static final String MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE = "MemoryPartition_Lifeline_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b6191c3f-6714-435e-b9e5-cd296be23674")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << MemoryPartition_Lifeline >> then instantiate a {@link MemoryPartitionLifeline} proxy.
     * 
     * @return a {@link MemoryPartitionLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("5a585c78-1018-4633-8d21-9d88cd96e1bd")
    public static MemoryPartitionLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionLifeline.STEREOTYPE_NAME);
        return MemoryPartitionLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLifeline} proxy from a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link MemoryPartitionLifeline} proxy or <i>null</i>.
     */
    @objid ("9e4a7441-b2e9-4e62-b80e-71fcc0a67c5f")
    public static MemoryPartitionLifeline instantiate(final Lifeline obj) {
        return MemoryPartitionLifeline.canInstantiate(obj) ? new MemoryPartitionLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionLifeline} proxy from a {@link Lifeline} stereotyped << MemoryPartition_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link MemoryPartitionLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4b592cb7-f96b-4d34-9d32-47a681c93d22")
    public static MemoryPartitionLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (MemoryPartitionLifeline.canInstantiate(obj))
        	return new MemoryPartitionLifeline(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("abe110e9-3e77-4021-bd41-c014ce756088")
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
        MemoryPartitionLifeline other = (MemoryPartitionLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("c9d244d6-7197-4697-b1c7-041e772c368e")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("15a7bd9e-1fa4-4099-9122-d982854e7b31")
    public List<String> getMemoryPartition_Lifeline_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a8c8a3c7-cb85-426c-8759-ccafb28404e1")
    public List<String> getMemoryPartition_Lifeline_exit() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4df23a8f-367c-477b-9f7a-cc57b2f9e16d")
    public List<String> getMemoryPartition_Lifeline_fork() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Lifeline_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cf32ecb2-b1cd-48bc-88df-9c43db23b92a")
    public List<String> getMemoryPartition_Lifeline_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("d34ac48a-be2f-41a1-bc64-5d8c8058c721")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b106007-5e11-48e4-b300-73c4b2702f23")
    public void setMemoryPartition_Lifeline_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55ba0c09-1820-40e7-b04a-1bebb09b9fca")
    public void setMemoryPartition_Lifeline_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdc44ea6-fbc5-4d95-8e58-7b56511b88f4")
    public void setMemoryPartition_Lifeline_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Lifeline_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad8b32c8-1786-4af7-8077-808f0c806180")
    public void setMemoryPartition_Lifeline_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionLifeline.MdaTypes.MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("858849c0-28d8-488a-a437-885364b67c4c")
    protected MemoryPartitionLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("69424f9d-a151-4471-9acf-8a14efcb538f")
    public static final class MdaTypes {
        @objid ("5d647863-2e19-469c-bfe2-b116d02f05b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8c8602a-d033-49a4-a04a-4944ccd984e7")
        public static TagType MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("6a395d4a-afe5-41eb-af6c-3830041dd29c")
        public static TagType MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("0ffb5319-a08e-4eae-b8e9-6e818011fdcb")
        public static TagType MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT;

        @objid ("76c6bde0-4095-4a04-a485-5863f0b8468e")
        public static TagType MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT;

        @objid ("0d014d7b-07e8-4fd0-b11d-252dae2f72f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a9716fd-a2a3-4390-ba53-773d1f7e699a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3adb3541-e40d-4beb-936b-8d033613c2b4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f5dcea50-10cf-11df-81d9-0014222a9f79");
            MEMORYPARTITION_LIFELINE_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273a9-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273aa-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273ab-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_LIFELINE_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1cf273ac-172b-11df-b92a-0014222a9f79");
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
