/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("b2c8ec21-666d-40ac-a7cd-7fdf03dd879b")
    public static final String STEREOTYPE_NAME = "Clock_Association";

    @objid ("19ef9a1c-c0ed-4d09-ae90-81225504f874")
    public static final String CLOCK_ASSOCIATION_STANDARD_TAGTYPE = "Clock_Association_standard";

    @objid ("7b32cb47-2931-43ed-b0ec-d36ae2f472bf")
    public static final String CLOCK_ASSOCIATION_TYPE_TAGTYPE = "Clock_Association_type";

    @objid ("3d9e3012-fec6-442b-b577-2b4bed0ecf89")
    public static final String CLOCK_ASSOCIATION_UNIT_TAGTYPE = "Clock_Association_unit";

    /**
     * The underlying {@link Association} represented by this proxy, never null.
     */
    @objid ("90e8ed5c-63e3-4747-a827-dfec4859de77")
    protected final Association elt;

    /**
     * Tells whether a {@link ClockAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << Clock_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("320756de-e34f-4c64-8f7d-b2b74cd7d7ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << Clock_Association >> then instantiate a {@link ClockAssociation} proxy.
     * 
     * @return a {@link ClockAssociation} proxy on the created {@link Association}.
     */
    @objid ("173bddc6-6d98-4326-a17a-dcdefebda5e0")
    public static ClockAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockAssociation.STEREOTYPE_NAME);
        return ClockAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ClockAssociation} proxy from a {@link Association} stereotyped << Clock_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ClockAssociation} proxy or <i>null</i>.
     */
    @objid ("83bd3e02-fd07-4faf-b4fc-d58b060af357")
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
    @objid ("9dadaeca-c105-4d49-a4fb-27987764cac1")
    public static ClockAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ClockAssociation.canInstantiate(obj))
        	return new ClockAssociation(obj);
        else
        	throw new IllegalArgumentException("ClockAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a5bc842-da41-49a2-91b8-6584767f7e23")
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
    @objid ("c7ea2e93-7d18-43a2-83ab-92244580a76e")
    public String getClock_Association_standard() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d7adeef-7d6a-44d8-9134-85275bfa6d31")
    public String getClock_Association_type() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6327ea5f-65b2-4ed5-b10f-1e2eaadf61a1")
    public String getClock_Association_unit() {
        return this.elt.getTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("8443c7f2-7fbf-4449-9226-6932a5db1ef0")
    public Association getElement() {
        return this.elt;
    }

    @objid ("01bf1f05-a40a-43c7-95c1-78bc93bbfb34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Clock_Association_standard'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55952dcb-82d6-4154-a81f-9c751269955c")
    public void setClock_Association_standard(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b12f7aa8-69c2-47f0-a6eb-77f544859be9")
    public void setClock_Association_type(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Clock_Association_unit'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a7ae5cf-453b-489f-b7ad-4a665afc8a83")
    public void setClock_Association_unit(final String value) {
        this.elt.putTagValue(ClockAssociation.MdaTypes.CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT, value);
    }

    @objid ("bd75a8ff-a99d-4eac-b664-25502bff2f0d")
    protected ClockAssociation(final Association elt) {
        this.elt = elt;
    }

    @objid ("e0e2fa04-0932-4056-a551-547ff1bb7f8d")
    public static final class MdaTypes {
        @objid ("a5269e71-3a47-4b44-92c2-16c2b29f85d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fa61c077-b4c7-4a68-9f68-ac837dd5e15f")
        public static TagType CLOCK_ASSOCIATION_STANDARD_TAGTYPE_ELT;

        @objid ("943062ca-40a7-4009-85a3-49c15852b2bd")
        public static TagType CLOCK_ASSOCIATION_TYPE_TAGTYPE_ELT;

        @objid ("9392e71a-8c22-4cb4-8694-23b7909af7be")
        public static TagType CLOCK_ASSOCIATION_UNIT_TAGTYPE_ELT;

        @objid ("bee24e84-a849-4f83-83af-a7b20046b3fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("eedabb98-e981-4411-a648-f1824afdb6b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("159d9e07-e3a5-4309-879f-25a3927fcf22")
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
