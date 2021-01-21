/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << PpUnit_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8c4f0308-0c2e-4513-89e2-3c4a7342a360")
public class PpUnitClass {
    @objid ("9d6519fd-2cd6-45d6-bb01-1b886b3deede")
    public static final String STEREOTYPE_NAME = "PpUnit_Class";

    @objid ("4eb7944f-2bb4-4204-acca-debaac9c9184")
    public static final String PPUNIT_CLASS_CONCPOLICY_TAGTYPE = "PpUnit_Class_concPolicy";

    @objid ("7a53d6ae-2016-4796-8a7a-56401f0d2d33")
    public static final String PPUNIT_CLASS_MEMORYSIZE_TAGTYPE = "PpUnit_Class_memorySize";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("4394fd1b-5ff4-41f4-b787-d57fdf4a6a7c")
    protected final Class elt;

    /**
     * Tells whether a {@link PpUnitClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PpUnit_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7b45e7bf-2795-4a2d-9f8a-4571a0b21f14")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PpUnit_Class >> then instantiate a {@link PpUnitClass} proxy.
     * 
     * @return a {@link PpUnitClass} proxy on the created {@link Class}.
     */
    @objid ("641cbf87-913e-49fb-b26d-7ad05afac169")
    public static PpUnitClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitClass.STEREOTYPE_NAME);
        return PpUnitClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitClass} proxy from a {@link Class} stereotyped << PpUnit_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PpUnitClass} proxy or <i>null</i>.
     */
    @objid ("5a1507e1-a53a-4f46-8c3c-46c8576409bf")
    public static PpUnitClass instantiate(final Class obj) {
        return PpUnitClass.canInstantiate(obj) ? new PpUnitClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitClass} proxy from a {@link Class} stereotyped << PpUnit_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PpUnitClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4cc6991f-3f69-4e9f-899a-8537f8c6f8f4")
    public static PpUnitClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PpUnitClass.canInstantiate(obj))
        	return new PpUnitClass(obj);
        else
        	throw new IllegalArgumentException("PpUnitClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("860f58cc-d331-4352-b730-8a887f66637b")
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
        PpUnitClass other = (PpUnitClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3f9ab098-bb1e-43db-ab56-413f7da182e0")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Class_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("906f0c39-74a2-4e1f-8f1a-88f7e0c545ed")
    public String getPpUnit_Class_concPolicy() {
        return this.elt.getTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("badc3e22-b266-460f-bf84-f5a082a80689")
    public String getPpUnit_Class_memorySize() {
        return this.elt.getTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("384fb580-2c75-4ba0-b73a-0dec421eeafa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Class_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("acf2d54e-2a61-4e3f-9b7f-232ba501278d")
    public void setPpUnit_Class_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Class_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c25abe2-8358-4bf2-9d81-9d90efe72109")
    public void setPpUnit_Class_memorySize(final String value) {
        this.elt.putTagValue(PpUnitClass.MdaTypes.PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("9911a42a-1d85-4a54-a07e-a4182fa46c6d")
    protected PpUnitClass(final Class elt) {
        this.elt = elt;
    }

    @objid ("5c2bdaf9-1055-4e56-a8c7-369c8de3fda0")
    public static final class MdaTypes {
        @objid ("0333bad4-61f3-474f-9230-2864c070dd60")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db9fcbe9-fd9c-4595-b40c-06c52aebf14b")
        public static TagType PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT;

        @objid ("5b0d2c14-9827-4258-9fa3-d7da49cb994c")
        public static TagType PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("7887084c-acff-451f-b664-cddddcd29d69")
        private static Stereotype MDAASSOCDEP;

        @objid ("c2dc5bf2-0deb-4093-b4dd-eb8d222c1051")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dffb4e18-3e92-43ba-b0e1-1b7534c3fd2b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d2b2763b-0ce9-11df-b742-001302895b2b");
            PPUNIT_CLASS_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2763c-0ce9-11df-b742-001302895b2b");
            PPUNIT_CLASS_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d2b2763d-0ce9-11df-b742-001302895b2b");
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
