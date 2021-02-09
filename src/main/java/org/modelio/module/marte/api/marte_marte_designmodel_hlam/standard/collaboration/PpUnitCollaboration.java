/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << PpUnit_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PpUnitCollaboration {
    public static final String STEREOTYPE_NAME = "PpUnit_Collaboration";

    public static final String PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE = "PpUnit_Collaboration_concPolicy";

    public static final String PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE = "PpUnit_Collaboration_memorySize";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    protected final Collaboration elt;

    /**
     * Tells whether a {@link PpUnitCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << PpUnit_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << PpUnit_Collaboration >> then instantiate a {@link PpUnitCollaboration} proxy.
     * 
     * @return a {@link PpUnitCollaboration} proxy on the created {@link Collaboration}.
     */
    public static PpUnitCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitCollaboration.STEREOTYPE_NAME);
        return PpUnitCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitCollaboration} proxy from a {@link Collaboration} stereotyped << PpUnit_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link PpUnitCollaboration} proxy or <i>null</i>.
     */
    public static PpUnitCollaboration instantiate(final Collaboration obj) {
        return PpUnitCollaboration.canInstantiate(obj) ? new PpUnitCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PpUnitCollaboration} proxy from a {@link Collaboration} stereotyped << PpUnit_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link PpUnitCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PpUnitCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (PpUnitCollaboration.canInstantiate(obj))
        	return new PpUnitCollaboration(obj);
        else
        	throw new IllegalArgumentException("PpUnitCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PpUnitCollaboration other = (PpUnitCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Collaboration_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_Collaboration_concPolicy() {
        return this.elt.getTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPpUnit_Collaboration_memorySize() {
        return this.elt.getTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Collaboration_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_Collaboration_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPpUnit_Collaboration_memorySize(final String value) {
        this.elt.putTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    protected PpUnitCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT;

        public static TagType PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d356f87d-0ce9-11df-b742-001302895b2b");
            PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d356f87e-0ce9-11df-b742-001302895b2b");
            PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d356f87f-0ce9-11df-b742-001302895b2b");
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
