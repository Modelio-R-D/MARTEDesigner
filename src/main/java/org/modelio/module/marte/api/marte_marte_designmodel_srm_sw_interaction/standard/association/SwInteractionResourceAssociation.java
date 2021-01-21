/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
 * Proxy class to handle a {@link Association} with << SwInteractionResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f3916949-12b8-4401-8383-ef69f63ded6e")
public class SwInteractionResourceAssociation extends SwResourceAssociation {
    @objid ("2e7c2588-9ad5-42db-b14a-53dbac0d3edd")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Association";

    @objid ("28ff3e25-dc20-499b-a066-fdf9c4e21d89")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Association_isIntraMemoryPartitionInteraction";

    @objid ("90d43d3e-5320-4850-816a-c28c4a962f06")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Association_waitingPolicyElements";

    @objid ("f321dbbb-f55c-498d-a3e6-53bffc2abc17")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Association_waitingQueueCapacity";

    @objid ("4d851232-c0a5-4e4f-8a77-0fbf03d95358")
    public static final String SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Association_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwInteractionResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4f496e98-f0be-4a67-95b8-b9ef9bd797ba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwInteractionResource_Association >> then instantiate a {@link SwInteractionResourceAssociation} proxy.
     * 
     * @return a {@link SwInteractionResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("2601a6b0-77a8-4589-a4d9-6673cb58fce1")
    public static SwInteractionResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAssociation.STEREOTYPE_NAME);
        return SwInteractionResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAssociation} proxy from a {@link Association} stereotyped << SwInteractionResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwInteractionResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("0c20d304-f1b2-417c-ba1e-399cb445beeb")
    public static SwInteractionResourceAssociation instantiate(final Association obj) {
        return SwInteractionResourceAssociation.canInstantiate(obj) ? new SwInteractionResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAssociation} proxy from a {@link Association} stereotyped << SwInteractionResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwInteractionResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ab5cfc2-051d-4057-9b41-ca134b1a892f")
    public static SwInteractionResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwInteractionResourceAssociation.canInstantiate(obj))
        	return new SwInteractionResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2c930ef4-10ac-4483-b4c9-2ed578f6d1b4")
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
        SwInteractionResourceAssociation other = (SwInteractionResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("4b7c46e0-dc0c-4f62-aaf8-455b36dbd283")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Association_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0f74a021-d959-4dc9-8fc9-daf5e78d1daa")
    public List<String> getSwInteractionResource_Association_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Association_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acbf4195-3766-4fc4-9057-ce56cb1c3061")
    public String getSwInteractionResource_Association_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Association_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("901a12b5-cbcf-45f0-baa4-3a5cbdc9797d")
    public String getSwInteractionResource_Association_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("58cf82b7-c37b-4746-9d2c-95af57c8f8f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Association_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("001bfa9f-2ef5-480b-b1d1-7bbc4ac73f17")
    public boolean isSwInteractionResource_Association_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Association_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acb4c424-7190-491b-974d-f196cf9e97be")
    public void setSwInteractionResource_Association_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Association_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6740d494-77e9-4e22-86a2-221cd70855db")
    public void setSwInteractionResource_Association_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Association_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7028188-b877-461a-b510-615d9fd757b4")
    public void setSwInteractionResource_Association_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Association_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6121cc68-cbb1-426d-a8a8-9e6a629176fd")
    public void setSwInteractionResource_Association_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceAssociation.MdaTypes.SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("e306515c-1822-4b50-9b7b-4c29f9995d9d")
    protected SwInteractionResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("83ee1b85-e7a9-4287-b0f5-0b8d8aedd707")
    public static final class MdaTypes {
        @objid ("2787fde1-a047-4d26-94f1-e23c3486e17d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d7c677e-a6de-4f2b-9990-6cd5a664a0dc")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("1254ae82-88b1-46ce-82b7-02daad739e73")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("92149d55-8843-4101-8478-7ced1b4cdf76")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("1fa26ace-59fa-4afc-b843-47725a8490ce")
        public static TagType SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("678e398d-143e-4430-84b2-22dc4be75628")
        private static Stereotype MDAASSOCDEP;

        @objid ("b12483b7-2629-4850-a4f0-cbf6c079f572")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16df7cd3-2c37-4466-90cc-f6c534edbce9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fde90ef9-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_ASSOCIATION_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde90efa-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde90efb-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde90efc-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_ASSOCIATION_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde90efd-10d8-11df-81d9-0014222a9f79");
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
