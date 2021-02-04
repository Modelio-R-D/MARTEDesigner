/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << Clock_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("28a59d22-41bb-4d0a-9d32-e6a69545c921")
public class ClockAssociation {
    @objid ("adeea43c-cfe3-4d4c-a763-4b006b358e5b")
    public static final String STEREOTYPE_NAME = "Clock_Association";

    @objid ("3302d760-5d17-4167-aa92-bd6a6408f2b7")
    public static final String CLOCK_ASSOCIATION_STANDARD_TAGTYPE = "Clock_Association_standard";

    @objid ("709da365-2c3d-4350-a874-0e0dbe51e706")
    public static final String CLOCK_ASSOCIATION_TYPE_TAGTYPE = "Clock_Association_type";

    @objid ("68136326-f00f-4a21-93c6-957a6344dece")
    public static final String CLOCK_ASSOCIATION_UNIT_TAGTYPE = "Clock_Association_unit";

    /**
     * The underlying {@link Association} represented by this proxy, never null.
     */
    @objid ("e46a08f8-6490-4281-927a-cacf8063a4b0")
    protected final Association elt;

    /**
     * Tells whether a {@link ClockAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Clock_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f49cbe5-70d4-49c1-80c5-a655f261b85d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Clock_Association >> then instantiate a {@link ClockAssociation} proxy.
     * 
     * @return a {@link ClockAssociation} proxy on the created {@link Association}.
     */
    @objid ("55e2122b-66cc-44a6-86e5-47ba14bfd132")
    public static ClockAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME);
        return ClockAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ClockAssociation} proxy from a {@link Association} stereotyped << Clock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ClockAssociation} proxy or <i>null</i>.
     */
    @objid ("299d9738-3471-4f1e-b1c2-eb0158238700")
    public static ClockAssociation instantiate(final Association obj) {
        return ClockAssociation.canInstantiate(obj) ? new ClockAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockAssociation} proxy from a {@link Association} stereotyped << Clock_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ClockAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a776cc08-4932-42d1-bd54-de64ea0d5943")
    public static ClockAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ClockAssociation.canInstantiate(obj))
        	return new ClockAssociation(obj);
        else
        	throw new IllegalArgumentException("ClockAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61a6ab56-5d45-4b0e-89c8-19013c25c310")
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
        ClockAssociation other = (ClockAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Clock_Association_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eefad831-be0d-4051-9db6-057cef50a712")
    public String getClock_Association_standard() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c851e51-9c84-4dba-9bd1-09891ad99b9a")
    public String getClock_Association_type() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d286dde7-1b38-4496-8bd3-14ab825e853b")
    public String getClock_Association_unit() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("0ef67128-ad1b-4e88-bba7-987ba9dc0e5f")
    public Association getElement() {
        return this.elt;
    }

    @objid ("9ae11425-bb49-4ab9-b59a-95b91712ce6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Association_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c22e26e-6542-48b7-aff0-962af5e8149b")
    public void setClock_Association_standard(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0e599cd5-7a1e-4bf5-9981-5dd229937cc8")
    public void setClock_Association_type(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4026fb56-af8d-4551-97bb-edd7109ab69c")
    public void setClock_Association_unit(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("2433cb21-3e41-4801-9995-9a89de172c3b")
    protected ClockAssociation(final Association elt) {
        this.elt = elt;
    }

    @objid ("e0e2fa04-0932-4056-a551-547ff1bb7f8d")
    public static final class MdaTypes {
        @objid ("92328f7b-1808-4c44-bfd0-992f3ac1039b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac297a85-553b-4f16-869e-31aedd056cb3")
        public static TagType CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT;

        @objid ("a5ff4765-3e1f-47dd-a1b5-99357af6fff2")
        public static TagType CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("6b5a8c27-05bc-4afe-9650-4c1770c5d05b")
        public static TagType CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT;

        @objid ("306d7ae2-1f09-4b8c-8828-bc3d4d113c51")
        private static Stereotype MDAASSOCDEP;

        @objid ("91ee9ce7-bb57-44a8-9658-c4c729bdcc7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("131bc204-c5b0-4a23-a01c-83dfd3672dd2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae30f8a-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae30f91-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e0-0cce-11df-8525-001302895b2b");
            CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571e7-0cce-11df-8525-001302895b2b");
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
