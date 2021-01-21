/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << NfpRefine_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("01750d15-f8b0-475c-8d24-dda6799172ae")
public class NfpRefineDependency {
    @objid ("e043bfcf-26b3-44be-8749-d6843b4d6e69")
    public static final String STEREOTYPE_NAME = "NfpRefine_Dependency";

    @objid ("47b6919f-039d-44a3-a46c-8e885e68cc88")
    public static final String NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE = "NfpRefine_Dependency_constraint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5ec077e4-a2cf-48cc-be3f-8991a3acda8c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link NfpRefineDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << NfpRefine_Dependency >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("42d1b6c1-03ec-4426-a2a2-d444fa0ed2d5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpRefineDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << NfpRefine_Dependency >> then instantiate a {@link NfpRefineDependency} proxy.
     * 
     * @return a {@link NfpRefineDependency} proxy on the created {@link Dependency}.
     */
    @objid ("3da2ce92-6493-460a-a1b0-6a7d8ff77625")
    public static NfpRefineDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpRefineDependency.STEREOTYPE_NAME);
        return NfpRefineDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link NfpRefineDependency} proxy from a {@link Dependency} stereotyped << NfpRefine_Dependency >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link NfpRefineDependency} proxy or <i>null</i>.
     */
    @objid ("9489ff04-4168-4618-9bbc-34baa0dfd1d7")
    public static NfpRefineDependency instantiate(final Dependency obj) {
        return NfpRefineDependency.canInstantiate(obj) ? new NfpRefineDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpRefineDependency} proxy from a {@link Dependency} stereotyped << NfpRefine_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link NfpRefineDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e7e4584-76a8-4f1e-8b90-79292ac3f52f")
    public static NfpRefineDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (NfpRefineDependency.canInstantiate(obj))
        	return new NfpRefineDependency(obj);
        else
        	throw new IllegalArgumentException("NfpRefineDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33949c60-11f7-4a21-bb50-0119aa41812d")
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
        NfpRefineDependency other = (NfpRefineDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b1b77c02-6ae8-4216-a8a9-41c8048b2e40")
    public Dependency getElement() {
        return this.elt;
    }

    /**
     * Getter for List<String> property 'NfpRefine_Dependency_constraint'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a7576af9-aefd-4374-a58a-6d3f48106d60")
    public List<String> getNfpRefine_Dependency_constraint() {
        return this.elt.getTagValues(NfpRefineDependency.MdaTypes.NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT);
    }

    @objid ("950cf259-4cfc-49e4-9fc3-cd94ec68ceca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'NfpRefine_Dependency_constraint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8e4b2f5-1bf7-404f-ab53-478e52bdcd20")
    public void setNfpRefine_Dependency_constraint(final List<String> values) {
        this.elt.putTagValues(NfpRefineDependency.MdaTypes.NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT, values);
    }

    @objid ("546056fc-a03d-4dd6-822a-25d9b68d6526")
    protected NfpRefineDependency(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0e571518-525a-440c-ba4a-c736930dd62a")
    public static final class MdaTypes {
        @objid ("af8a185a-12e2-448b-9982-6db1ac00aa9f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8e13532-b194-4f46-916b-c22141ab7c93")
        public static TagType NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT;

        @objid ("47324cc9-c72d-44ea-b641-a8b510001463")
        private static Stereotype MDAASSOCDEP;

        @objid ("076bf9b1-5031-44c9-88c6-90049cc1bbf2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f7809f1-33aa-4b67-ba6a-de006770c109")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00b4be56-0ccf-11df-8525-001302895b2b");
            NFPREFINE_DEPENDENCY_CONSTRAINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00b720a7-0ccf-11df-8525-001302895b2b");
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
