/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association.SwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << MemoryPartition_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cb54dcbe-413a-40c5-aacc-054116c2858a")
public class MemoryPartitionAssociation extends SwResourceAssociation {
    @objid ("39ee9eb2-ad51-4c9e-9fe4-49edac45df6b")
    public static final String STEREOTYPE_NAME = "MemoryPartition_Association";

    @objid ("e26fe1eb-7304-4af7-a078-46bea5a6d2ab")
    public static final String MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE = "MemoryPartition_Association_concurrentResources";

    @objid ("5d2b7c30-ed3b-472d-bbab-96d0854a9ca7")
    public static final String MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE = "MemoryPartition_Association_exit";

    @objid ("d2d5d279-1452-4cc7-a7e2-11b765eebdc6")
    public static final String MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE = "MemoryPartition_Association_fork";

    @objid ("b5c96eae-b3f1-4330-a8a4-48ba58ff5158")
    public static final String MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE = "MemoryPartition_Association_memorySpaces";

    /**
     * Tells whether a {@link MemoryPartitionAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << MemoryPartition_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2cba72b9-bbc7-4e74-aac5-d9fcfb981411")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << MemoryPartition_Association >> then instantiate a {@link MemoryPartitionAssociation} proxy.
     * 
     * @return a {@link MemoryPartitionAssociation} proxy on the created {@link Association}.
     */
    @objid ("203ec07c-7e34-4e75-b70e-768fdc621dba")
    public static MemoryPartitionAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, MemoryPartitionAssociation.STEREOTYPE_NAME);
        return MemoryPartitionAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociation} proxy from a {@link Association} stereotyped << MemoryPartition_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link MemoryPartitionAssociation} proxy or <i>null</i>.
     */
    @objid ("c701f3e0-b4fe-4490-9bd3-6450d38b2d49")
    public static MemoryPartitionAssociation instantiate(final Association obj) {
        return MemoryPartitionAssociation.canInstantiate(obj) ? new MemoryPartitionAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MemoryPartitionAssociation} proxy from a {@link Association} stereotyped << MemoryPartition_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link MemoryPartitionAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c120977a-258f-4881-bb3e-6e249e215d8d")
    public static MemoryPartitionAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (MemoryPartitionAssociation.canInstantiate(obj))
        	return new MemoryPartitionAssociation(obj);
        else
        	throw new IllegalArgumentException("MemoryPartitionAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a78247e6-12f0-42ff-8c8f-4940a54ac13a")
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
        MemoryPartitionAssociation other = (MemoryPartitionAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("898ed92b-5b9f-46f6-bdf6-03e3b26a33ec")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_concurrentResources'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("89b20853-fb35-43ec-a4ae-2c6a88f6841d")
    public List<String> getMemoryPartition_Association_concurrentResources() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_exit'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ea38ccba-a2dd-4760-aec7-d0cdd30bbb0c")
    public List<String> getMemoryPartition_Association_exit() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_fork'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("591f1325-6e73-46b4-9169-80578624f526")
    public List<String> getMemoryPartition_Association_fork() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'MemoryPartition_Association_memorySpaces'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c58b431c-6986-4518-91b6-8b2a1bca8858")
    public List<String> getMemoryPartition_Association_memorySpaces() {
        return this.elt.getTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT);
    }

    @objid ("f7f9d840-2fd3-4ab8-adac-cc9ae44e2571")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_concurrentResources'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f821323-d93a-4953-8d40-9392be51e7c7")
    public void setMemoryPartition_Association_concurrentResources(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_exit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("925f9fb1-b00e-4243-be91-3f10e3ac2f0e")
    public void setMemoryPartition_Association_exit(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_fork'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("84b658fa-ada2-4d2a-b05c-07b6e36bb104")
    public void setMemoryPartition_Association_fork(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'MemoryPartition_Association_memorySpaces'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dc2452b-a177-49e3-b930-46bdf58ef449")
    public void setMemoryPartition_Association_memorySpaces(final List<String> values) {
        this.elt.putTagValues(MemoryPartitionAssociation.MdaTypes.MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT, values);
    }

    @objid ("fbdb62ed-94e8-4e82-bc3c-ec67ec5daba6")
    protected MemoryPartitionAssociation(final Association elt) {
        super(elt);
    }

    @objid ("622dc393-255b-433d-ad2b-d7836fd3662b")
    public static final class MdaTypes {
        @objid ("46b1f8ce-120d-464a-a40a-129591afdc0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df0315b4-dc64-470f-a454-191de56f4c9c")
        public static TagType MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT;

        @objid ("2bd631a5-355d-47f3-ad10-8b497af5fe45")
        public static TagType MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT;

        @objid ("3aee5943-e503-4c7b-8e05-c2a72a834d00")
        public static TagType MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT;

        @objid ("4a6c8d4f-c27b-49b8-a56c-74c72bda0e85")
        public static TagType MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT;

        @objid ("12c4a54b-e23f-4a0f-a792-6fc227ddf7eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9f7f6a6-807d-4e5c-b1c1-93b3248c30a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f7742146-3622-4426-9f5f-62f552d88997")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f5bdeb97-10cf-11df-81d9-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_CONCURRENTRESOURCES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5d-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_MEMORYSPACES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5e-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_FORK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a5f-172b-11df-b92a-0014222a9f79");
            MEMORYPARTITION_ASSOCIATION_EXIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1dcb6a60-172b-11df-b92a-0014222a9f79");
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
