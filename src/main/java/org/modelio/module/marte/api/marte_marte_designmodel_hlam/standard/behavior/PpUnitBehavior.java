/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior;

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
 * Proxy class to handle a {@link Behavior} with << PpUnit_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3c72783f-603f-4d0a-9d63-139c5ee110de")
public class PpUnitBehavior {
    @objid ("4f6ffdd1-6854-4a46-bdb1-90b7bc22d3bf")
    public static final String STEREOTYPE_NAME = "PpUnit_Behavior";

    @objid ("b9c2130c-e2b7-4fdd-a4c2-1bd89d288374")
    public static final String PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE = "PpUnit_Behavior_concPolicy";

    @objid ("0c7f0521-f248-477f-9b3c-d2ab7df355c3")
    public static final String PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE = "PpUnit_Behavior_memorySize";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("208c7460-adfe-490c-888f-3948a50aa024")
    protected final Behavior elt;

    /**
     * Tells whether a {@link PpUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << PpUnit_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8f23eeb0-e599-48c8-a2f6-c0a9dbad52dc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << PpUnit_Behavior >> then instantiate a {@link PpUnitBehavior} proxy.
     * 
     * @return a {@link PpUnitBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("acb1a4df-451f-4758-9f4f-4fd108670590")
    public static PpUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitBehavior.STEREOTYPE_NAME);
        return PpUnitBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitBehavior} proxy from a {@link Behavior} stereotyped << PpUnit_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link PpUnitBehavior} proxy or <i>null</i>.
     */
    @objid ("74046bc7-add5-4c1c-8b12-feb7ad0ba173")
    public static PpUnitBehavior instantiate(final Behavior obj) {
        return PpUnitBehavior.canInstantiate(obj) ? new PpUnitBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitBehavior} proxy from a {@link Behavior} stereotyped << PpUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link PpUnitBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ca05228-6f95-46fe-b2c8-77b7e5ac2ffe")
    public static PpUnitBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (PpUnitBehavior.canInstantiate(obj))
        	return new PpUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("PpUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f907150e-1e08-496e-99d5-2f3d4926222a")
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
        PpUnitBehavior other = (PpUnitBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("18f00b10-57af-4005-ad64-3e60003f3e14")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Behavior_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b552a94a-9e53-41fa-a8cc-1848e05b2244")
    public String getPpUnit_Behavior_concPolicy() {
        return this.elt.getTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb709f86-8b92-4972-9186-b2ebe9bba6f1")
    public String getPpUnit_Behavior_memorySize() {
        return this.elt.getTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("a398d0fa-da00-4f1e-b516-247f2d171717")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Behavior_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3a081df-c709-4e2e-8350-069b86f7cb96")
    public void setPpUnit_Behavior_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd10b6cb-7c7e-4214-ab0c-81a144367789")
    public void setPpUnit_Behavior_memorySize(final String value) {
        this.elt.putTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("7b2fd133-cf0f-413b-8d55-e5f1415b6ffa")
    protected PpUnitBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("aac01a2b-2662-4a39-9878-48bfaae4242e")
    public static final class MdaTypes {
        @objid ("30e940a7-f39a-48a8-8e83-b154aa8b6391")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a411a1bb-2ba8-40b9-85ee-76d44f86d82d")
        public static TagType PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT;

        @objid ("6823eae8-ae8e-40be-9e35-3ffa80fc4aa8")
        public static TagType PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("7e919fe1-8ecf-4884-bc8b-10a1a7976bcf")
        private static Stereotype MDAASSOCDEP;

        @objid ("fbb4fce6-24c9-4792-8b8f-67eb52c8ae6e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1f5aff32-050f-4c05-9629-08ff5c2f4e83")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aa02b950-0cea-11df-b742-001302895b2b");
            PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aa02b94f-0cea-11df-b742-001302895b2b");
            PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "aa02b951-0cea-11df-b742-001302895b2b");
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
