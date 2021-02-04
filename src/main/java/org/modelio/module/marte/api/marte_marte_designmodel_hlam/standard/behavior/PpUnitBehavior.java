/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("a71fac65-a621-4d3d-918d-6c1a0fddc553")
    public static final String STEREOTYPE_NAME = "PpUnit_Behavior";

    @objid ("3706ad0d-cda9-4537-9c25-f9ad221f87c7")
    public static final String PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE = "PpUnit_Behavior_concPolicy";

    @objid ("79e7e89c-58cd-4767-b45d-664654aa0df8")
    public static final String PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE = "PpUnit_Behavior_memorySize";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("9b36d6a0-dd98-4186-b372-32630f52d2a4")
    protected final Behavior elt;

    /**
     * Tells whether a {@link PpUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << PpUnit_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eee85988-9826-498e-9925-7a2ef9dfda42")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << PpUnit_Behavior >> then instantiate a {@link PpUnitBehavior} proxy.
     * 
     * @return a {@link PpUnitBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("2db7520a-b8e7-41c7-990d-00bce4d88fcf")
    public static PpUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitBehavior.STEREOTYPE_NAME);
        return PpUnitBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitBehavior} proxy from a {@link Behavior} stereotyped << PpUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link PpUnitBehavior} proxy or <i>null</i>.
     */
    @objid ("c2770a6a-5baf-4e38-8fb9-8386aa419d60")
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
    @objid ("36ed02cb-335b-42ea-ab6f-d3e927ff9a7a")
    public static PpUnitBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (PpUnitBehavior.canInstantiate(obj))
        	return new PpUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("PpUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("791064c6-534f-49d0-a6f2-f2a078472468")
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
    @objid ("f054a395-1594-4709-a583-c05a1107dea1")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Behavior_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f59379a3-cf38-42bf-b38f-d1805713a4b4")
    public String getPpUnit_Behavior_concPolicy() {
        return this.elt.getTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9f185ed1-812a-4c42-9cb6-a97348d75201")
    public String getPpUnit_Behavior_memorySize() {
        return this.elt.getTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("b3f9db26-9a69-4464-b9a2-def3dba26d9a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Behavior_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c4476a2-5371-429b-9523-f3b9fc0e7005")
    public void setPpUnit_Behavior_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c481976-39f8-4aa3-b8cc-711078601bc2")
    public void setPpUnit_Behavior_memorySize(final String value) {
        this.elt.putTagValue(PpUnitBehavior.MdaTypes.PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("ce55f30a-84bc-44aa-badd-efce881eab17")
    protected PpUnitBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("aac01a2b-2662-4a39-9878-48bfaae4242e")
    public static final class MdaTypes {
        @objid ("7201501f-256d-4554-adc3-ac0550f47855")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a5035e0-24b8-40cb-9cf3-af32c698dae8")
        public static TagType PPUNIT_BEHAVIOR_CONCPOLICY_TAGTYPE_ELT;

        @objid ("1e7b132e-04c1-4c94-be1e-9eb819434401")
        public static TagType PPUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("a6d61db3-1ae6-4b30-9872-31883e6dafcd")
        private static Stereotype MDAASSOCDEP;

        @objid ("5aeecdab-c221-4598-b422-be79b1808c79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a51af23b-1df0-4e20-9212-70979aecf25d")
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
