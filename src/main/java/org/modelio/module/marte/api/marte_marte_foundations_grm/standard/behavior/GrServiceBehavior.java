/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << GrService_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8dd9156a-51dd-420d-ada7-c27dd6b96760")
public class GrServiceBehavior {
    @objid ("bbd3c29a-3556-4469-a857-935f715c9596")
    public static final String STEREOTYPE_NAME = "GrService_Behavior";

    @objid ("056d8a0a-f46f-4fd7-bd9d-279b82c4b170")
    public static final String GRSERVICE_BEHAVIOR_OWNER_TAGTYPE = "GrService_Behavior_owner";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("122c6aca-bf8b-4fbe-bcf3-f4d1ff0f39a4")
    protected final Behavior elt;

    /**
     * Tells whether a {@link GrServiceBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << GrService_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("20dfdd14-93a4-4bfc-be23-dc274848507c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << GrService_Behavior >> then instantiate a {@link GrServiceBehavior} proxy.
     * 
     * @return a {@link GrServiceBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("21a627df-fcac-4b00-a328-2ae335f5d833")
    public static GrServiceBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GrServiceBehavior.STEREOTYPE_NAME);
        return GrServiceBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link GrServiceBehavior} proxy or <i>null</i>.
     */
    @objid ("58aba3e7-3ed7-4b34-bbc8-ca579dd82106")
    public static GrServiceBehavior instantiate(final Behavior obj) {
        return GrServiceBehavior.canInstantiate(obj) ? new GrServiceBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GrServiceBehavior} proxy from a {@link Behavior} stereotyped << GrService_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link GrServiceBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("27327a7c-0703-4d8f-8896-23094d906771")
    public static GrServiceBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (GrServiceBehavior.canInstantiate(obj))
        	return new GrServiceBehavior(obj);
        else
        	throw new IllegalArgumentException("GrServiceBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e2c097eb-10b6-4d85-8a24-5da9e5e377e6")
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
        GrServiceBehavior other = (GrServiceBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("083ba0a0-961c-4fce-984e-e53e4e6e2ef1")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88ba186f-bbf2-4fcd-8105-0b7961afe794")
    public String getGrService_Behavior_owner() {
        return this.elt.getTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT);
    }

    @objid ("98547ef2-ed51-4d18-aebb-0e78ecf54f51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GrService_Behavior_owner'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1fed368-f90b-4c52-8eb4-aecd7046cb0a")
    public void setGrService_Behavior_owner(final String value) {
        this.elt.putTagValue(GrServiceBehavior.MdaTypes.GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT, value);
    }

    @objid ("642c87f6-5c59-45fe-9d88-d915bc85e431")
    protected GrServiceBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("8706da06-8ca9-47c7-8ae5-75bc25b0f419")
    public static final class MdaTypes {
        @objid ("6db83baf-09f3-4931-b293-2af3f358a0c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b15fd505-dd1a-4cc9-968b-3c6ea3beee1d")
        public static TagType GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT;

        @objid ("161cb3bd-a320-410b-a465-f34dd177b06b")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa3e4954-0e31-4db3-b003-23340b14ea09")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("18063ce3-919e-420a-966e-bf46215dc616")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b8f6af0d-0f4a-11df-8c52-0014222a9f79");
            GRSERVICE_BEHAVIOR_OWNER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c36c1fdb-0f4a-11df-8c52-0014222a9f79");
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
