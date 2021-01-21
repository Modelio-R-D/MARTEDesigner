/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.collaboration;

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
@objid ("0e019af2-d314-4ae4-858a-d9c3f1d70253")
public class PpUnitCollaboration {
    @objid ("da81a577-4f83-4998-bcd2-e211bdaa9606")
    public static final String STEREOTYPE_NAME = "PpUnit_Collaboration";

    @objid ("90f6e346-e6e4-4e25-9afc-5e0051bfc51b")
    public static final String PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE = "PpUnit_Collaboration_concPolicy";

    @objid ("a9c297f0-935d-4659-bc10-c17ed3798008")
    public static final String PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE = "PpUnit_Collaboration_memorySize";

    /**
     * The underlying {@link Collaboration} represented by this proxy, never null.
     */
    @objid ("5b326441-6662-4037-9268-6a92aa7135d6")
    protected final Collaboration elt;

    /**
     * Tells whether a {@link PpUnitCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << PpUnit_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("803de65e-9a03-4385-bcb8-e36eb47401fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << PpUnit_Collaboration >> then instantiate a {@link PpUnitCollaboration} proxy.
     * 
     * @return a {@link PpUnitCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("e69f6f0c-390a-4cc3-bfe8-5c4ed85042e3")
    public static PpUnitCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PpUnitCollaboration.STEREOTYPE_NAME);
        return PpUnitCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link PpUnitCollaboration} proxy from a {@link Collaboration} stereotyped << PpUnit_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link PpUnitCollaboration} proxy or <i>null</i>.
     */
    @objid ("4e7d1ca3-0fbb-46ae-b301-8f1507126e76")
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
    @objid ("2ee04db1-a5b9-4a81-9cb1-13ef32b4bbc1")
    public static PpUnitCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (PpUnitCollaboration.canInstantiate(obj))
        	return new PpUnitCollaboration(obj);
        else
        	throw new IllegalArgumentException("PpUnitCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1ab3a068-8ea5-4e2b-939f-0f2741796f4a")
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
    @objid ("f262b69c-2520-40e6-8d41-0f60aa6cb5a9")
    public Collaboration getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PpUnit_Collaboration_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12e57642-e910-431a-81cd-0712bc2c104a")
    public String getPpUnit_Collaboration_concPolicy() {
        return this.elt.getTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PpUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d725f82-48ad-4a5e-a017-649452749dcd")
    public String getPpUnit_Collaboration_memorySize() {
        return this.elt.getTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT);
    }

    @objid ("c5f36c5e-2d3b-4da7-95a0-3793d0c3341c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PpUnit_Collaboration_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bbc53c17-039f-47ce-ac52-5baaf0684f64")
    public void setPpUnit_Collaboration_concPolicy(final String value) {
        this.elt.putTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PpUnit_Collaboration_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c38f8ef-47db-4a6d-a011-048921b0aa91")
    public void setPpUnit_Collaboration_memorySize(final String value) {
        this.elt.putTagValue(PpUnitCollaboration.MdaTypes.PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    @objid ("683c413a-a013-4ad5-a6b4-096219d4591d")
    protected PpUnitCollaboration(final Collaboration elt) {
        this.elt = elt;
    }

    @objid ("6a956e7c-7491-4672-8327-cd30c8b66f51")
    public static final class MdaTypes {
        @objid ("514f5284-1f7c-4a0f-bb3b-6ec839664275")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a161f090-d3ca-425e-b4e8-421d9f31b80e")
        public static TagType PPUNIT_COLLABORATION_CONCPOLICY_TAGTYPE_ELT;

        @objid ("e2b3779f-30f9-4238-a77c-5de3ddfb4cc3")
        public static TagType PPUNIT_COLLABORATION_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("97aa9856-2fa7-4ac1-ab1d-360d4a216014")
        private static Stereotype MDAASSOCDEP;

        @objid ("d5dc4da0-64b1-4fb8-bdc0-49818d57eff9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d4ff0b2-85b9-4eb3-a18b-646af03750a6")
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
