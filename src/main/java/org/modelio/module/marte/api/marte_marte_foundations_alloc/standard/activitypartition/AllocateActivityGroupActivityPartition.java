/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.standard.activitypartition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ActivityPartition} with << AllocateActivityGroup_ActivityPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6090aae-a012-4f05-8645-58bedb42dd2c")
public class AllocateActivityGroupActivityPartition {
    @objid ("814431d8-1588-4135-9056-e9011f1c6f29")
    public static final String STEREOTYPE_NAME = "AllocateActivityGroup_ActivityPartition";

    @objid ("46aabb93-c7bb-41dc-b169-e73ee671d335")
    public static final String ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE = "AllocateActivityGroup_ActivityPartition_isUnique";

    /**
     * The underlying {@link ActivityPartition} represented by this proxy, never null.
     */
    @objid ("3cea06be-c4b4-4cb1-a9cc-605f72db240a")
    protected final ActivityPartition elt;

    /**
     * Tells whether a {@link AllocateActivityGroupActivityPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityPartition} stereotyped << AllocateActivityGroup_ActivityPartition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("88a38069-ade0-4261-9414-e304f06c8308")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityPartition) && ((ActivityPartition) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AllocateActivityGroupActivityPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityPartition} stereotyped << AllocateActivityGroup_ActivityPartition >> then instantiate a {@link AllocateActivityGroupActivityPartition} proxy.
     * 
     * @return a {@link AllocateActivityGroupActivityPartition} proxy on the created {@link ActivityPartition}.
     */
    @objid ("7ce923c7-87e4-4372-a871-42de04e2933f")
    public static AllocateActivityGroupActivityPartition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ActivityPartition");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AllocateActivityGroupActivityPartition.STEREOTYPE_NAME);
        return AllocateActivityGroupActivityPartition.instantiate((ActivityPartition)e);
    }

    /**
     * Tries to instantiate a {@link AllocateActivityGroupActivityPartition} proxy from a {@link ActivityPartition} stereotyped << AllocateActivityGroup_ActivityPartition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityPartition
     * @return a {@link AllocateActivityGroupActivityPartition} proxy or <i>null</i>.
     */
    @objid ("6bce39b6-9d4e-40fd-a968-53b1ee77ccb6")
    public static AllocateActivityGroupActivityPartition instantiate(final ActivityPartition obj) {
        return AllocateActivityGroupActivityPartition.canInstantiate(obj) ? new AllocateActivityGroupActivityPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AllocateActivityGroupActivityPartition} proxy from a {@link ActivityPartition} stereotyped << AllocateActivityGroup_ActivityPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ActivityPartition}
     * @return a {@link AllocateActivityGroupActivityPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("475eb844-1541-4d18-b0a2-911e78a57cf8")
    public static AllocateActivityGroupActivityPartition safeInstantiate(final ActivityPartition obj) throws IllegalArgumentException {
        if (AllocateActivityGroupActivityPartition.canInstantiate(obj))
        	return new AllocateActivityGroupActivityPartition(obj);
        else
        	throw new IllegalArgumentException("AllocateActivityGroupActivityPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("90783ec2-a061-4193-9fbe-428cfd3eda4f")
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
        AllocateActivityGroupActivityPartition other = (AllocateActivityGroupActivityPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ActivityPartition}. 
     * @return the ActivityPartition represented by this proxy, never null.
     */
    @objid ("7f8540fb-ae97-424a-aeee-1d382e6a0bde")
    public ActivityPartition getElement() {
        return this.elt;
    }

    @objid ("08e00cb0-55aa-4da0-b0bf-600d00be3f17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'AllocateActivityGroup_ActivityPartition_isUnique'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66b7e0cc-691a-4d43-ad3c-767fbc067dc2")
    public boolean isAllocateActivityGroup_ActivityPartition_isUnique() {
        return this.elt.isTagged(AllocateActivityGroupActivityPartition.MdaTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'AllocateActivityGroup_ActivityPartition_isUnique'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3f3d52e-c22f-44c5-88b9-755fa4da9819")
    public void setAllocateActivityGroup_ActivityPartition_isUnique(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AllocateActivityGroupActivityPartition.MdaTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AllocateActivityGroupActivityPartition.MdaTypes.ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE_ELT);
    }

    @objid ("2eb8c4fd-ae22-4d30-a000-f24bf8ea0e57")
    protected AllocateActivityGroupActivityPartition(final ActivityPartition elt) {
        this.elt = elt;
    }

    @objid ("aeb0919e-438d-409a-a940-ee176de1d12d")
    public static final class MdaTypes {
        @objid ("70403508-2ac2-4940-8732-e7212e83ea62")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9cc15c5-3f0b-4fdc-8322-6beeeb498792")
        public static TagType ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE_ELT;

        @objid ("ab8c8d00-fbb0-4d5a-996c-7ca9201d2e73")
        private static Stereotype MDAASSOCDEP;

        @objid ("75b72c51-f046-4e92-80bd-ff8ddc55b770")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef40c188-f524-46bc-9e8c-41dcb4565bf0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00b4be54-0ccf-11df-8525-001302895b2b");
            ALLOCATEACTIVITYGROUP_ACTIVITYPARTITION_ISUNIQUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b4be55-0ccf-11df-8525-001302895b2b");
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
